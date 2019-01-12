/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.javaact;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap a >");
        float a = sr.nextFloat();
        if(a%2==0)
        {
            System.out.println(a+" "+" là số chẵn");
        }else{
            System.out.println(a+" "+"là số lẻ");
        }
        
    }
}
