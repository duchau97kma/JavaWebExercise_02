/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9;

/**
 *
 * @author Winter
 */
public class StudentManager {
    private Student[] listStudents;
    private static final int MAX=10;
    private int count;
   
    public StudentManager() {
        this.listStudents = new Student[MAX];
        this.count=0;   
    }
    public void add(){
        Input input = new Input();
        System.out.println("Input ID:");
        String id = input.inputID();
        System.out.println("Input Name:");
        String name = input.inputName();
        System.out.println("Input Mark:");
        double mark = input.inputMark();
        System.out.println("Input Phone:");
        String phone =input.inputPhone();
        
        Student st = new Student(id, name, mark, phone);
        this.listStudents[this.count]= st;
        this.count++;
        
    }
    public void list(){
        System.out.println("----List Student----");
        for (int i = 0; i < this.count; i++) {
        System.out.println(this.listStudents[i]);
  
        }
    }
    public void showTop(int num){
        Student[] arr = this.orderList();
        System.out.printf("-----TOP %d-----\n",num);
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
    private Student[] orderList(){
        Student[] arr = this.listStudents;
        for (int i = 0; i < this.count; i++) {
            for (int j = i+1; j < this.count; j++) {
                if (arr[i].getMark()< arr[j].getMark()) {
                    Student temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        return arr;
    }
    
}
