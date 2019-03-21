/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class StudentManager {

    private Student[] listStudents;
        int n=0;
    public void inListStudent() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input total student:");
        int n = sr.nextInt();
        listStudents = new Student[n];

        for (int i = 0; i < n; i++) {
            listStudents[i] = new Student();
            System.out.println("Input student No." + (i + 1) + ":");
            listStudents[i].input();
            System.out.println("-----------------------------");
        }

    }

    public boolean add(Student stud) {
            
            //listStudents = new Student[n];
            if(n>=listStudents.length)
            return false;
            listStudents[n]=stud;
            n++;
            return true;
        
    }
    //done
    public void search(String name) {
        boolean found=false;
        for (int i = 0; i < listStudents.length; i++) {
            if (name.equalsIgnoreCase(listStudents[i].getName())) {
                listStudents[i].print();
                found=true;
            }
         if(found){
             System.out.println("Không tìm thấy!");
         }
            
        }
    }

    public void list() {
        Scanner sr = new Scanner(System.in);

        boolean check = true;

        for (int i = 0; i < listStudents.length; i++) {
            this.list(!check);
            listStudents[i].print();
        }

    }
//done
    public void list(boolean order) {

        for (int i = 0; i < listStudents.length - 1; i++) {
            for (int j = i + 1; j < listStudents.length; j++) {
                if (order) {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) > 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                } else {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) < 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
        }

    }

   }

