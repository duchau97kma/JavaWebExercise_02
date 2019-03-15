/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Shop {

    ArrayList<Product> ProductList = new ArrayList<>();

    public void addProduct() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input total product: ");
        int n = sr.nextInt();
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            System.out.println("Product No." + " " + (i + 1) + ":");
            product.input();
            ProductList.add(product);
            
        }
    }

    public void iterateProductList() {
        System.out.println("======Infomation of product====== ");
        for (int i = 0; i < ProductList.size(); i++) {
            System.out.println("Product No." + " " + (i + 1) + ":");
            ProductList.get(i).viewInfo();
            System.out.println("=================================");
        }
    }

    public void removeProduct() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input name of product you want remove:");
        String name = sr.nextLine();
        for (int i = 0; i < ProductList.size(); i++) {
            if (ProductList.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(name + ": " + "exist");
                ProductList.remove(i);
                System.out.println(name + ": " + "has been remove");
                // iterateProductList();
            } else {
                System.out.println("Item not found");
            }
        }

    }

    public void searchProduct() {
        Scanner sr = new Scanner(System.in);
        System.out.println("first number:");
        int num1 = sr.nextInt();
        System.out.println("second number:");
        int num2 = sr.nextInt();
        for (int i = 0; i < ProductList.size(); i++) {
            if (ProductList.get(i).getPrice() > num1 || ProductList.get(i).getPrice() < num2) {
                ProductList.get(i).viewInfo();
            }
        }
    }

    public void SortProduct() {
        System.out.println("Sort by progressive price:");
        Collections.sort(ProductList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        iterateProductList();
    }

}
