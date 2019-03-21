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
public class Store {
       private Product[] products;
       
      public void addProduct(){
          Scanner sr = new Scanner(System.in);
          int select=0;
          System.out.println("Input total product:");
          int n = sr.nextInt();
          products = new Product[n];
          for (int i = 0; i < n; i++) {
              do {              
              System.out.println("What do you want choose?");
              System.out.println("1.SmartPhone");
              System.out.println("2.Camera");
              select = sr.nextInt();
              switch(select)
              {
                  case 1:
                      products[i] = new SmartPhone();
                      System.out.println("Input smartphone No."+(i+1)+":");
                      products[i].addNew();
                      break;
                  case 2:
                      products[i] = new Camera();
                      System.out.println("Input camera No."+(i+1)+":");
                      products[i].addNew();
                      break;
                  default:
                      System.out.println("Error, input again!");
                      break;
              }
          } while (select!=1 && select!=2);
          }
          
      }
      public void search(String name){
          
          for (int i = 0; i < products.length; i++) {
              if(name.equalsIgnoreCase(products[i].getName())){
                  products[i].print();
              }else{
                  System.out.println("Item not found!");
              }
          }
          
      }
      public void listProduct(){
          System.out.println("==========Infomation of products==========");
          for (int i = 0; i < products.length; i++) {
              products[i].print();
          }
      }
}
