/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;
import java.util.function.IntPredicate;

/**
 *
 * @author Winter
 */
public class bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arrA= new int[3][3];
        int[][] arrB= new int[3][3];
        int[][] arrSum= new int[3][3];
        int[][] arrMul= new int[3][3];
        System.out.println("Nhập vào ma trận A:");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                arrA[i][j]= in.nextInt();
            }
            
        }
        System.out.println("Nhập vào ma trận B:");
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                arrB[i][j]= in.nextInt();
            }
            
        }
        //Tính tổng ma trận
        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < arrSum.length; j++) {
                arrSum[i][j]=arrA[i][j]+arrB[i][j];
            }
        }
        System.out.println("Ma trận tổng là:");
        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j <arrSum.length; j++) {
                System.out.print(arrSum[i][j]+"\t");
            }
            System.out.println("\n");
        }
        //Tính tích ma trận
        for (int i = 0; i < arrMul.length; i++) {
            
               for (int j = 0; j < arrMul.length; j++) {
                   for (int k = 0; k < arrMul.length; k++) {
                         arrMul[i][j]+=arrA[i][k]*arrB[k][j];
                   }
               
            } 
            
            
        }
        System.out.println("Ma trận tích là:");
        for (int i = 0; i < arrMul.length; i++) {
            for (int j = 0; j <arrMul.length; j++) {
                System.out.print(arrMul[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
