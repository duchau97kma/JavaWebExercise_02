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
public class Parallelogram extends Polygon{
    private int a;
    private int b;
    private int height;

    public Parallelogram() {
    }

    public Parallelogram(int a, int b, int height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
   @Override
   public double getArea(){
       return this.a*this.height;
   }
    @Override
   public double getPerimeter(){
       return (this.a+this.b)*2;
   }
}
