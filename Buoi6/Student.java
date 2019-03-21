/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Student {
    private String name;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Input name:");
        this.name = sr.nextLine();
        System.out.println("Input email:");
        this.email = sr.nextLine();
        System.out.println("Input age:");
        this.age = sr.nextInt();
    }
    public void print(){
        System.out.println("----------Infomation of student----------");
        System.out.println("Name:"+this.getName());
        System.out.println("Email:"+this.getEmail());
        System.out.println("Age:"+this.getAge());
    }
    public static void main(String[] args) {
        Student st = new Student();
        st.input();
        st.print();
    }
}
