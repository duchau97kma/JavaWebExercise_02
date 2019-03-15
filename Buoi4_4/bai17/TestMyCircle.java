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
public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(3, 4);
        
        MyCircle mc = new MyCircle(point, 6);
        System.out.println(mc.toString());
        System.out.println("Area of my circle is: "+mc.getArea());
    }
}
