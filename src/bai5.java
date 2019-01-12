
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
public class bai5 {
    public static int fibonaci(int n)
    {
        if(n==1||n==2)
            return 1;
        else
            for (int i = 0; i < n; i++) {
                return fibonaci(n-1)+fibonaci(n-2);
            }
         return 0;
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào n");
        int n = nhap.nextInt();
        int kq=0;
        for (int i = 0; i < n; i++) {
             System.out.print("\t"+fibonaci(i));
        }

        
    }
}
