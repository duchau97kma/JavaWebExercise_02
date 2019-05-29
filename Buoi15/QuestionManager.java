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

/**
 *
 * @author Winter
 */
public class QuestionManager {
    private Connection conn;

    public QuestionManager() throws SQLException {
        DBconnect dBconnect = new DBconnect();
        this.conn = dBconnect.getConnection();
    }
    public ArrayList<Question> getQuestions() throws SQLException{
        ArrayList<Question> list = new ArrayList<>();
        String sql = "SELECT * FROM question";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Question q = new Question();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswerA(rs.getString("answer_a"));
            q.setAnswerB(rs.getString("answer_b"));
            q.setAnswerC(rs.getString("answer_c"));
            q.setAnswerD(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);
        }
        return list;
    }
    
}
