/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Process p = new Process();
        Scanner sr = new Scanner(System.in);
        int chon = 0;
        while (true) {
            System.out.println("1. Query 1");
            System.out.println("2. Query 2");
            System.out.println("3. Query 3");
            System.out.println("4. Query 4");
            System.out.println("5. Query 5");
            System.out.println("6. Exit");
            System.out.println("-Chon-");
            chon = sr.nextInt();
            switch (chon) {
                case 1:
                    p.ex1();
                    break;
                case 2:
                    System.out.println("bookname >");
                    String name = sr.nextLine();
                    System.out.println("date>");
                    String date = sr.nextLine();
                    p.ex2(name, date);
                    break;
                case 3:
                    p.ex3();
                    break;
                case 4:
                    p.ex4();
                    break;
                case 5:
                    System.out.println("Name:");
                    String nameStr = sr.nextLine();
                    p.ex5(nameStr);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
