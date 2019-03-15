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
public class Elip extends Point{
    private int a;
    private int b;
    private Point centerElip;

    public Elip() {
    }

    public Elip(int a, int b, Point centerElip) {
        this.a = a;
        this.b = b;
        this.centerElip = centerElip;
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

    public Point getCenterElip() {
        return centerElip;
    }

    public void setCenterElip(Point centerElip) {
        this.centerElip = centerElip;
    }

    @Override
    public String toString() {
        return "Elip@"+centerElip.toString()+" and "+"a=" +this.a+","+"b="+this.b;
    }
    public double getArea(){
        return Math.PI*this.a*this.b;
    }
    
}
