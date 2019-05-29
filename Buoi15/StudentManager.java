/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class StudentManager {
    private Connection conn;

    public StudentManager() throws SQLException {
        DBconnect dBconnect = new DBconnect();
        this.conn = dBconnect.getConnection();
    }
    
    public Student login(String email,String pass) throws SQLException{
        String sql = "SELECT * FROM students WHERE email = ? AND pass = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs = pstmt.executeQuery();
        Student s = null;
        
        if (rs.next()) {
            s = new Student(rs.getInt("id"), rs.getString("name"), 
                    rs.getString("email"), rs.getString("pass"));
        }
        
        return s;
    }
    
    public int addAnswer(Student s, Question q, String answer) throws SQLException {
        String query = "INSERT INTO student_question VALUES (?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        return pstmt.executeUpdate();
    }
    
    public void printResult() throws SQLException {
        System.out.println("------------------------");
        String query = "Select answer from student_question ";
         PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        String answer=null;
        while(rs.next()){
             answer =rs.getString("answer");
            
        }
        QuestionManager qm = new QuestionManager();
            ArrayList<Question>  questions = qm.getQuestions();
            String Correct = null;
                int index = 1;
             for (Question q : questions) {
                 if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        Correct="True";
                    }else{
                     Correct="False";
                 }
                System.out.printf("Question %d/%d - %s\n", index++, questions.size(),Correct);
                    
                    System.out.println(q);
             }
            
    }
    public static void main(String[] args) throws SQLException {
        StudentManager sm = new StudentManager();
        sm.printResult();
    }

}
