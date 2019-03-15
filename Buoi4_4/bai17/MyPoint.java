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
public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ')';
    }

    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return  Math.sqrt(xDiff * xDiff + yDiff * yDiff); 
    }
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(5, 6));
        
        
    }
}
