/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi10.bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class SimpleVim {

    Scanner sr = new Scanner(System.in);

    public File newFile(String path, String name) throws IOException {
        File f = new File(path, name);
        if (f.createNewFile()) {
            System.out.println("Create Success!");
        } else {
            System.out.println("Fail!");
        }
        return f;
    }

    public void writerFile(String path, String name) throws IOException {
        do {
            System.out.println("Input description:");
            String contain = sr.nextLine();
            if (contain.endsWith(":q")) {
                break;
            }
            if (contain.endsWith(":wq")) {
                File f = new File(path, name);
                try {
                    PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
                    pw.print(contain.substring(0, contain.length() - 3));
                    pw.flush();
                    pw.close();
                    System.out.println("Save success!");
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
            break;

        } while (true);
    }

    public void readFile(String path) {
        File f = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String readLine = reader.readLine();
            System.out.println("Description of file: ");
            do {
                System.out.println(readLine);
                readLine = reader.readLine();
            } while (readLine != null);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
