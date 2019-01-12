
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Winter
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        int min=1,max=0,temp=0;
        System.out.println("Nhập vào n");
        do {            
             n = nhap.nextInt();
             temp = n;
             if(temp>max)
                 max=n;
             else if(temp>min)
             {
                min=n;
                
             }
        } while (n!=0);
        System.out.println("Số lớn nhất:"+max);
        System.out.println("Số nhỏ nhất:"+min);
        
        
    }
}
