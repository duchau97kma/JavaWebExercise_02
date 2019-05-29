/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi15;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Winter
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sr = new Scanner(System.in);
        System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = sr.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = sr.nextLine();
            StudentManager sm = new StudentManager();
            Student s = sm.login(email, pass);
            if (s != null) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                sr.nextLine();
                System.out.println("---------------");
                QuestionManager qm = new QuestionManager();
                
                ArrayList<Question>  questions = qm.getQuestions();
                int countCorrect = 0;
                int index = 1;
                for (Question q : questions) {
                    System.out.printf("Question %d/%d \n", index++, questions.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = sr.nextLine();
                    sm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorrect++;
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorrect, questions.size());
                System.out.println("See Detail (Y/N)");
                String c = sr.nextLine();
                 if (c.toUpperCase().equals("Y")) {
                   sm.printResult();  
                 }else if (c.toUpperCase().equals("N")) {
                     System.exit(0);
                 }
                 
                
            }else{
                System.out.println("Err");
            }
    }
}
