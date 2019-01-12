
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
public class bai1 {
   public static boolean check(int n)
    {
        
        for (int i = 2; i <= n; i++) {
            if(n%2==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        
    }
        return false;
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào n=");
        int n = nhap.nextInt();
        int dem=0;
        for (int i = 2; dem < n; i++) {
            if(check(i))
            {
            System.out.println(i + " ");
            dem++;
            }
             
        }
//        int i=2;
//       while (dem < n) {
//            if (check(i)) {
//                System.out.print(i + " ");
//                dem++;
//                System.out.println(".."+dem);
//            }
//            i++;
//        }

    }
        
    }

