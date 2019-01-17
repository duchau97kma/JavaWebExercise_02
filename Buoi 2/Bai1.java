/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap vao a>");
        float a = sr.nextFloat();
        System.out.println("Nhap vao b>");
        float b = sr.nextFloat();
        System.out.println("Nhap vao c>");
        float c = sr.nextFloat();
        float delta = b*b - 4*a*c;
        if(delta<0)
        {
            System.out.println("Phương trình vô nghiệm!");
        }else if(delta==0)
        {
            
            System.out.println("Phương trình có nghiệm kép x1=x2="+(-b)/(2*a));
        }else if(delta>0)
        {
            System.out.println("Phương trình có nghiệm x1="+(-b+Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có nghiệm x2="+(-b-Math.sqrt(delta))/(2*a));
        }
    }
}
