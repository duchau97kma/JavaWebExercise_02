/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai13;

/**
 *
 * @author Winter
 */
public class Main {

    public static void main(String[] args) {
        Point point = new Point(4, 3);
        Elip elip = new Elip(2, 5, point);
        System.out.println("MyElip" + elip.toString());
        System.out.println("Area of Elip:" + elip.getArea());
    }
}
