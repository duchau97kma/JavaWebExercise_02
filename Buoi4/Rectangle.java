/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai6;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Rectangle {
    private double chieuDai,chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void input()
    {
        System.out.println("Nhập vào độ dài các cạnh:");
        Scanner sr = new Scanner(System.in);
        chieuDai = sr.nextDouble();
        chieuRong = sr.nextDouble();
    }
    public double chuVi()
    {
        return 2*(chieuDai+chieuRong);
    }
    public double dienTich()
    {
        return chieuDai*chieuRong;
    }
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        hcn.input();
        System.out.println("Chu vi:"+hcn.chuVi());
        System.out.println("Diện tích:"+hcn.dienTich());
    }
}
