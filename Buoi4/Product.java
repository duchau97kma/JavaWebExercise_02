/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai18;

/**
 *
 * @author Winter
 */
public class Product {
    private String Name;
    private String Description;
    private double Price;
    private int [] rate = new int[4];

    public Product() {
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
    public void viewInfo(){
        System.out.println("Product Name:"+this.Name);
        System.out.println("Description Products:"+this.Description);
        System.out.println("Price:"+this.Price);
    }
}
