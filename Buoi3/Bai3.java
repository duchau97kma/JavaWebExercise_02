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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int[] arr = new int[5];
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a["+i+"]=");
            arr[i]= sr.nextInt();
        }
        System.out.println("Mảng đã nhập là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("Nhập phần tử muốn tìm n >>");
        int n = sr.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i])
            {
                System.out.println("Phần tử"+n+"xuất hiện trong mảng tại vị trí"+(i+1));
                break;
            }
//else if(n!=arr[i]){
//                System.out.println("Phần tử"+n+"không xuất hiện trong mảng");
//                break;
//            }
        }
    }
}
