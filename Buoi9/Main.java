/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        do {
            System.out.println("---MENU---");
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Top 3");
            System.out.println("4. Exit");
            System.out.print("--Select-- ");
            int c = sr.nextInt();
            switch (c) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.list();
                    break;
                case 3:
                    manager.showTop(3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
            }
        } while (true);
    }
}
