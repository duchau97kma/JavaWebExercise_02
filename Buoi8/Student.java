/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_2;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Student extends Person{
 private String email;

    public Student() {
    }

    public Student(String id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Input email: ");
        Scanner sr = new Scanner(System.in);

        this.email = sr.nextLine();
    }

    @Override
    public String toString() {
        return "Student{id=" + this.getId() + "name=" + this.getName() + "email=" + email + '}';
    }
    
}
