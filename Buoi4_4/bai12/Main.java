/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_2;

/**
 *
 * @author Winter
 */
public class Main {
    public static void main(String[] args) {
         Polygon p = new Parallelogram();
    Parallelogram para = new Parallelogram(2, 3, 2);
        System.out.println("Parallelogram");
        System.out.println(para.getArea());
        System.out.println(para.getPerimeter());
        System.out.println("==============");
    Rectangle rec = new Rectangle(2, 5);
        System.out.println(" Rectangle");
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    System.out.println("==============");
    Square sq = new Square(2);
        System.out.println("Square");
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
    }
   
}
