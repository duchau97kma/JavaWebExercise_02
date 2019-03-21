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
public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
    }

    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }
    
    @Override
    public void addNew(){
       
        Scanner sr = new Scanner(System.in);
        super.addNew();
        System.out.println("Has wifi?(1/0)");
        int check = sr.nextInt();
        if(check==1){
           this.setHasWifi(true);
        }else if(check==0){
            this.setHasWifi(false);
        }
        
       
    }
    
    @Override
    public void print(){
        super.print();
        System.out.print("|"+this.isHasWifi());
    }
    
}
