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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        long gt=1;
        System.out.println("Nhập vào n=");
        long n = sr.nextLong();
        for(int i=1;i<=n;i++)
        {
            gt*=i;
        }
        System.out.println("n!="+" "+gt);
    }
}
