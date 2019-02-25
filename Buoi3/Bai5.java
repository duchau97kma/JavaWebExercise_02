/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arrA= new int[3];
        int[] arrB= new int[3];
        int[] arrTong= new int[3];
        int[] arrTich= new int[3];
        int tichVH=0;
        System.out.println("Nhập vào vector A:");
        for(int i=0;i<arrA.length;i++)
        {
             arrA[i] = input.nextInt();
        }
        System.out.println("Nhập vào vector B:");
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = input.nextInt();
        }
        System.out.println("Tổng 2 Vector là: ");
        for(int i=0;i<arrTong.length;i++)
        {
            arrTong[i]= arrA[i]+arrB[i];
            System.out.print("\t"+arrTong[i]);
        }
        System.out.println("\nTích vô hướng 2 vector là:");
        for(int i=0;i<arrTich.length;i++)
        {
            tichVH+=arrA[i]*arrB[i];
        }
        System.out.println(tichVH);
    }
}
