
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
public class bai8 {
    public static void main(String[] args) {
        int n,r,sum=0,temp;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào n=");
        n=nhap.nextInt();
        
        
        for(temp=n;n!=0;n=n/10){
         r=n%10;
         sum=sum*10+r;
    }
    if(temp==sum)
    {
        System.out.println(temp+"  là số đối xứng");
    }else
            System.out.println(temp+"  không là số đối xứng");

    }
}
