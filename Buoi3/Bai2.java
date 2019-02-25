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
public class Bai2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int min = arr[0], max = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < 5; i++) {
            arr[i] = nhap.nextInt();
        }
        min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);

    }
}
