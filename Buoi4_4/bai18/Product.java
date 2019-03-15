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
public class Product {

    private String Name;
    private String Description;
    private double Price; // 0 < Price <= 100
    private int[] rate; // lưu các đánh giá của người dùng cho sản phẩm, giá trị từ 1 - 5
    Scanner sr = new Scanner(System.in);
    public Product() {
    }

    public Product(String Name, String Description, double Price, int[] rate) {
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.rate = rate;
    }
    public Product(String Name, String Description, double Price) {
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }
    
    public void input(){
        System.out.println("Name:");
        setName(sr.nextLine());
        System.out.println("Descsription:");
        setDescription(sr.nextLine());
        System.out.println("Price");
        setPrice(sr.nextDouble());
        
    }
    public void viewInfo() {
        System.out.println("Name of product:"+this.Name);
        System.out.println("Description:"+this.Description);
        System.out.println("Price: $"+this.Price);
    }
    public static void main(String[] args) {
        Product pr = new Product();
        pr.input();
        pr.viewInfo();
    }

}
