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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew(){
        Scanner sr = new Scanner(System.in);
        super.addNew();
        System.out.println("Input total sim: ");
        this.sim = sr.nextInt();
        System.out.println("Has camera?(1/0):");
        int check = sr.nextInt();
        if(check==1){
            this.setHasCamera(true);
        }else if(check==0){
            this.setHasCamera(false);
        }
    }
    @Override
    public void print(){
        super.print();
        System.out.print(this.getSim()+"|"+this.isHasCamera()+"\n");
    }
    
}
