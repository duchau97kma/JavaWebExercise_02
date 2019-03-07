/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai11;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Matrix {
    private int a[][];
    private int row,clms;
    
    Scanner sr = new Scanner(System.in);
    
    public void input(){
        System.out.println("input colums:");
        clms = sr.nextInt();
        System.out.println("input rows");
        row = sr.nextInt();
        a= new int[row][clms];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clms; j++) {
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=sr.nextInt();
            }
            
        }
        
    }
    public void ouput(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clms; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public Matrix add(Matrix mt1,Matrix mt2)
    {
        System.out.println(mt1.a[0][0]);
        System.out.println(mt2.a[0][0]);
        Matrix sum = new Matrix();
       
        sum.a= new int[row][clms];
        for (int i = 0; i < sum.row; i++) {
            for (int j = 0; j < sum.clms; j++) {
                sum.a[i][j]=mt1.a[i][j]+mt2.a[i][j];
            }
        }
        return  sum;
    }
     
    public static void main(String[] args) {
        Matrix mt1 = new Matrix();
        mt1.input();
        mt1.ouput();
        Matrix mt2 = new  Matrix();
        mt2.input();
        mt1.ouput();
        Matrix sum = new Matrix();
        sum.add(mt1, mt2);
        
        
    }
}
