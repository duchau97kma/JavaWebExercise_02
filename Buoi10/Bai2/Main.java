/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi10.bai2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SimpleVim spv = new SimpleVim();
        int select=0;
        Scanner sr = new Scanner(System.in);
        do {            
            System.out.println("1. Create file");
            System.out.println("2. Write");
            System.out.println("3. Read");
            System.out.println("4. Exit");
            System.out.println("Select?");
            select = sr.nextInt();
            switch(select){
                case 1:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String path = sr.nextLine();
                    System.out.println("Input name:");
                    String name = sr.nextLine();
                    spv.newFile(path, name);
                    break;
                case 2:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String pathWr = sr.nextLine();
                    System.out.println("Input name:");
                    String nameFile = sr.nextLine();
                    spv.writerFile(pathWr, nameFile);
                    break;
                case 3:
                     sr.nextLine();
                     System.out.println("Input path:");
                     String pathRead = sr.nextLine();
                     spv.readFile(pathRead);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (true);
    }
}
