/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Winter
 */
public class bai4 {
    public static void main(String[] args) {
        Random rd = new Random();
       int[] arr = new int[15];
       int dem1=0,dem2=0;
        System.out.println("Mảng ngẫu nhiên tăng dần: ");
        for (int i = 0; i < arr.length; i++) {   
                arr[i] = rd.nextInt(15);
                Arrays.sort(arr);
                if(arr[i]%2==0)
                {
                    dem1++;
                }else if(arr[i]%2!=0)
                {
                    dem2++;
                }
                System.out.print("\t"+arr[i]);
            }
                System.out.println("\nSố lượng chẵn:"+dem1);
                System.out.println("Số lượng lẻ:"+dem2);
        System.out.println("\n Mảng theo chiều giảm dần: ");
        for(int i= arr.length-1;i>=0;i--)
        {
                arr[i] = rd.nextInt(15);
                Arrays.sort(arr);
                System.out.print("\t"+arr[i]);
        }
      
          
        }
       
    }
