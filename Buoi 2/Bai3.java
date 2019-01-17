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
public class Bai3 {
    
    public static boolean checkSNT(int n){
        
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int dem=0;
        System.out.println("Nhập vào n=");
        int n = sr.nextInt();
//        if(checkSNT(n)){
//            System.out.println(n+" "+"là số nguyên tố");
//        }else
//        {
//            System.out.println("Không phải");
//        }
        int i = 2;
        while (dem < n) {
            if (checkSNT(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }

        
    }
}
