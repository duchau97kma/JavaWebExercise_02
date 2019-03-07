/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai4;

/**
 *
 * @author Winter
 */
public class SoNguyenTo {
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x) {
        if(isSoNguyento(x))
        {
            this.a=x;
            System.out.println(a);
        }else{
            System.out.println("Không lưu trữ");
        }
    }
    public boolean isSoNguyento(int x)
    {
        for(int i=0;i< Math.sqrt(x/2);i++)
        {
            if(x%2==0)
                return false;
            else
                return true;
        }
        
        return false;
    }
    public int timSoNguyenToTiepTheo(){
        
        int i;
        
        for ( i = 2; i <this.a; i++) {
            if(isSoNguyento(i))
            {
                System.out.println("Kết quả:"+i);
            }
        }
        
        return i;
    }
    
    public static void main(String[] args) {
        SoNguyenTo snt = new SoNguyenTo(3);
        snt.timSoNguyenToTiepTheo();
    }
}
