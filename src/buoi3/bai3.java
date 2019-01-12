/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class bai3 {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = nhap.nextInt();
            
        }
        System.out.println("Xuất mảng:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t"+arr[i]);
        }
        int a;
        System.out.println("Tìm kiếm phần tử");
        a=nhap.nextInt();
        
        for (int i = 0; i < 5; i++) {
            if(a==arr[i])
            {
                System.out.println("Phần tử tìm kiếm được ở vị trí"+i);
            }
            else
            {
                System.out.println("Không tồn tại");
            }
        
        
        
    }
    }
}
