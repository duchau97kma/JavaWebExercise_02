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
public class Employee extends Person{
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sr = new Scanner(System.in);
        System.out.print("Input Saraly: ");
        this.salary = Double.parseDouble(sr.nextLine());
    }
    
    @Override
    public String toString() {
        return "Student{id=" + this.getId() + ",name=" + this.getName() + ",salary=" + salary + '}';
    }
}
