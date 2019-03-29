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
public class Person {
    private String id;
    private String name;
//    protected Scanner input;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void input() {
        Scanner sr = new Scanner(System.in);
        System.out.print("Input ID:");
        this.id = sr.nextLine();
        System.out.print("Input name: ");
        this.name = sr.nextLine();
    }
}
