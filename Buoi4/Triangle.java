/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai5;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Triangle {

    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void input() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh của tam giác: ");
        a = sr.nextDouble();
        b = sr.nextDouble();
        c = sr.nextDouble();
    }

    public void TamGiac() {
        if (a + b > c && b + c > a && a + c > b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông!");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân!");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("Đây là tam giác thường!");
            } else {
                System.out.println("Đây là tam giác đều!");
            }

        } else {
            System.out.println("Không phải tam giác");
        }
    }

    public double ChuVi() {
        return this.a + this.b + this.c;
    }

    public double DienTich() {
        
        double p = (a + b + c) / 2;
         double dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("diện tích là:"+dientich);
        return dientich;
    }

    public static void main(String[] args) {
        Triangle tg = new Triangle();
        tg.input();
        tg.TamGiac();
        System.out.println("Chu vi:"+tg.ChuVi());
        tg.DienTich();

    }
}
