/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Input {

   // Student st = new Student();
    Scanner sr = new Scanner(System.in);

    public String inputID() {
        
        String tempID = sr.nextLine();
        try {
            if (!tempID.matches("HV[0-9]{3}")) {
                throw new Exception("Phải bắt đầu bằng HV và 3 số");
            }
        } catch (Exception e) {
            System.out.println("Sai định dạng!");
            System.out.println(e.getMessage());
            return this.inputID();
        }
        return tempID;
    }

    public String inputName() {
        String tempName = sr.nextLine();
        return tempName;
    }

    public double inputMark() {
        double tempMark = 0;

        do {
            tempMark = sr.nextDouble();

        } while (!(tempMark >= 1 && tempMark <= 10));

        return tempMark;
    }

    public String inputPhone() {
         sr.nextLine();
        String tempPhone = sr.nextLine();
       
        try {
            if (!tempPhone.matches("(09|01[2|6|8|9])+([0-9]{8})\\b")) {
                throw new Exception("Số đt chưa đúng!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Nhập sai định dạng!");

            return this.inputPhone();
        }

        return tempPhone;
    }

}
