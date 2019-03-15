/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai18;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int chon=0;
        Scanner sr = new Scanner(System.in);
        do {            
            System.out.println("1.Add new product");
            System.out.println("2.Remove product");
            System.out.println("3.Iterate product list");
            System.out.println("4.Search product ");
            System.out.println("5.Sort by price");
            System.out.println("6.Exit");
            System.out.println("Input method you want choose:");
            chon = sr.nextInt();
            
            switch(chon)
            {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.removeProduct();
                    break;
                case 3:
                     shop.searchProduct();
                    break;
                case 4:
                   shop.iterateProductList();
                    break;
                case 5:
                    shop.SortProduct();
                    break;
                default:
                    System.out.println("You choose not yet valid");
                    break;
            }
        } while (chon!=6);
    }
}
