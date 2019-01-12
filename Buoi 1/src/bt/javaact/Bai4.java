/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.javaact;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        float temp;
        System.out.println("Nhập vao a >");
        float a = sr.nextFloat();
        System.out.println("Nhập vào b>");
        float b = sr.nextFloat();
        temp = a;
        a = b;
        b= temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
