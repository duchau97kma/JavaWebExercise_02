/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai15;

/**
 *
 * @author Winter
 */
public class Battery {

    private int energy;

    public Battery() {
        energy = 100;
    }

    //Thiết đặt lại giá trị mới cho pin (thực hiện việc sạc pin)
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void decreaseEnergy() {
        this.energy -= 2;
        // System.out.println("Năng lượng còn lại là: "+this.energy);
    }

}
