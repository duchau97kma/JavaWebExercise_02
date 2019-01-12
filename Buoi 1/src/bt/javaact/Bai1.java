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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap vao so thuc: ");
        double n = sr.nextDouble();
        System.out.println(n+"^2"+"="+n*n);
    }
}
