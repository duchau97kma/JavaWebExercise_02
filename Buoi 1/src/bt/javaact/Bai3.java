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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap vao a >");
        int a = sr.nextInt();
        System.out.println("Nhap vao b >");
        int b = sr.nextInt();
        if(a>b)
        {
            System.out.println(a+">"+b);
        }else
        {
            System.out.println(a+"<"+b);
        }
    }
}
