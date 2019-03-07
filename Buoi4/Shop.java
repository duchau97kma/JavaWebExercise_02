/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Shop{

    ArrayList<Product> ProductsList = new ArrayList<>();
    Product pr = new Product();
    Scanner sr = new Scanner(System.in);
    public void input(){
        
    }
    public void addProduct(){
       
                 
            System.out.println("Input information of product:");
            System.out.println("Name:");
            pr.setName(sr.nextLine());
            System.out.println("Description:");
            pr.setName(sr.nextLine());
            System.out.println("Price:");
            pr.setPrice(sr.nextDouble());
            ProductsList.add(pr);
        
        
    }
    public void removeProduct()
    {
        
    
    }
    public void iterateProductList(){
        for (int i = 0; i < ProductsList.size(); i++) {
            System.out.println("The information about Product"+" "+(i+1)+" "+"is:");
            ProductsList.get(i).viewInfo();
        }
    }
    public void searchProduct(String name){
        
        
    }



    
    
    public static void main(String[] args) {
     Shop shop = new Shop();
     shop.addProduct();
     System.out.println("====");
     shop.iterateProductList();
        
    }
}
