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
public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addNew() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input name of product:");
        this.setName(sr.nextLine());
        System.out.println("Input id of product:");
        this.setId(sr.nextInt());

        System.out.println("Input price: ");
        this.setPrice(sr.nextDouble());

        System.out.println("Input quantity:");
        this.setQuantity(sr.nextInt());
    }

    public void print() {
        System.out.print(this.getId() + "|" + this.getName() + "|" + this.getPrice() + "|" + this.getQuantity()+"|");
    }

    public static void main(String[] args) {
        Product pr = new Product();
        pr.addNew();
        
        pr.print();
    }
}
