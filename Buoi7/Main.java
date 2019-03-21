/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Store store = new Store();
       
    do {
            System.out.println("1.  Add Product");
            System.out.println("2.  List Product");
            System.out.println("3.  Search");
            System.out.println("4.  Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sr.nextLine());

            switch (choice) {
                case 1:
                   store.addProduct();
                    break;
                case 2:
                    store.listProduct();
                    break;
                case 3:
                    System.out.println("Input products you want to search:");
                    String name = sr.nextLine();
                    store.search(name);
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
