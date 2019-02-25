/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i;
        int [] arrA = new int[15];
        System.out.println("Ramdom 15 phan tu vao mang ");
        for (i=0; i<15;i++)
        {
            arrA[i]=rd.nextInt();
            
            System.out.print(arrA[i]+"\t");
        }
//        System.out.println("\n"+"Sap xep theo chieu tang dan");
//        for (i=0; i<15;i++)
//        {
//            for (int j = i+1; i < 15; j++)               
//            {
//                if (arrA[i] > arrA[j])
//                {
//                    int temp = arrA[i];
//                    arrA[i] = arrA[j];
//                    arrA[j] = temp;
//                    
//                }       
//             System.out.print(arrA[i]+"\t");     
//        }   
//       
//    }
    }
}
