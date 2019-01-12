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
public class Bai2 {
   
    public static void main(String[] args) {
         Scanner sr = new Scanner(System.in);
        System.out.println("Nhap vao a >");
        double a = sr.nextDouble();
        System.out.println("Nhap vao b >");
        double b = sr.nextDouble();
        System.out.println("Nhap vao c >");
        double c = sr.nextDouble();
        System.out.println("Ket qua: x ="+(c-b)/a);
    }
}
