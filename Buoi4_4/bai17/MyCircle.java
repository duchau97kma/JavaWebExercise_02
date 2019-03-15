/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai17;

/**
 *
 * @author Winter
 */
public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
    }
    
    
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    

    
    @Override
    public String toString() {
        return "Circle@" +center.toString()+"+ radius=" + radius;
    }
    
    public double getArea(){
        return Math.PI*Math.PI*radius;
    }
    
}
