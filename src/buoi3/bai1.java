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
public class bai1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0, sum1 = 0;
        System.out.println("Nhập vào số phần tử: ");
        Scanner nhap = new Scanner(System.in);
        int n = nhap.nextInt();
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = nhap.nextInt();
        }

        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);

        }
        for (int i = 0; i < n; i++) {
            // sum=sum+arr[i];
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            } else {
                sum1 = sum1 + arr[i];
            }
        }
        System.out.println("\nTổng các phần tử chẵn trong mảng là: " + sum);
        System.out.println("\nTổng các phẩn tử lẻ trong mảng là: " + sum1);
    }
}
