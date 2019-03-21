/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        do {
            System.out.println("1.  List");
            System.out.println("2.  Search");
            System.out.println("3.  Add");
            System.out.println("4.  Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sr.nextLine());

            switch (choice) {
                case 1:
                    sm.list();
                    break;
                case 2:
                    System.out.println("Input name of student:");
                    String name = sr.nextLine();
                    sm.search(name);
                    break;
                case 3:
                    sm.inListStudent();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!!!");
            }

        } while (true);
    }
}
