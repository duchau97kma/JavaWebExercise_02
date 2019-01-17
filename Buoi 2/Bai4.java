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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n,min=1,max=0,temp=0;
         do {            
           System.out.println("Nhập vào n=");
         n= sr.nextInt();
         temp=n;
         if(temp>max)
         {
             max=n;
         }else if(temp>min)
         {
             min=n;
         }
        } while (n!=0);
         System.out.println("Số lớn nhất:"+max);
         System.out.println("Số nhỏ nhất:"+min);
       
    }
}
