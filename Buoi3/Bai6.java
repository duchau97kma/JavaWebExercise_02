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
public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] sumClums= new int[3];
        int[] sumRow= new int[3];
        System.out.println("Nhập vào các phần tử của ma trận:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("a["+i+"]["+j+"]=");
                arr[i][j]= input.nextInt();
            }
        }
         System.out.println("Ma trận vừa nhập là:");
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
             System.out.println("\n");
         }
        //System.out.println("Tổng mỗi hàng của ma trận:");
         for(int i=0;i<arr.length;i++)
         {
             sumRow[i]=0;
             for(int j=0;j<arr.length;j++)
             {
                 sumRow[i]+=arr[i][j];
                 
             }
         }
         //System.out.println("Tổng mỗi cột của ma trận:");
         for(int i=0;i<arr.length;i++)
         {
             sumClums[i]=0;
             for(int j=0;j<arr.length;j++)
             {
                 sumClums[i]+=arr[j][i];
                 
             }
         }
         System.out.println("Tổng mỗi hàng:");
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print(sumRow[i]+"\t");
         System.out.print("\n");
            
    }
         System.out.println("Tổng mỗi cột:");
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
           
         System.out.print("\n\n");
             System.out.print(sumClums[i]+"\t");
    }
    }
}
