/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai1;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Nhanvien {
   
    private String ten,tuoi,diachi;
    private double luong;
    private int time;

    public Nhanvien() {
    }

    public Nhanvien(String ten, String tuoi, String diachi, double luong, int time) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.time = time;
    }
    public void inputInfo()
    {
         Scanner sr = new Scanner(System.in);
        System.out.println("Nhập các thông tin sv");
//        while(true){
            System.out.println("Tên:");
            setTen(sr.nextLine());
            System.out.println("Tuổi:");
            setTuoi(sr.nextLine());
            System.out.println("Địa chỉ:");
            setDiachi(sr.nextLine());
            System.out.println("Lương:");
            setLuong(sr.nextDouble());
            System.out.println("Thời gian làm:");
            setTime(sr.nextInt());
            //sr.nextLine();
        //}
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTen() {
        return ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public double getLuong() {
        return luong;
    }

    public int getTime() {
        return time;
    }
    

    public void printInfo()
    {
        System.out.println("Thông tin nhân viên là:");
        System.out.println("Tên:"+this.getTen());
        System.out.println("Tuổi:"+this.getTuoi());
        System.out.println("Địa chỉ:"+this.getDiachi());
        System.out.println("Lương:"+this.getLuong());
        System.out.println("Thời gian làm:"+this.getTime());
        System.out.println("Số tiền thưởng:"+this.tinhThuong());
    }
    public double tinhThuong(){
        if(this.time>=200)
            return this.luong*0.2;
        if(this.time < 200 || this.time >=100)
            return this.luong*0.1;
        else if(this.time <100)
            return this.luong;
        return 0;
    }
    public static void main(String[] args) {
         
        Nhanvien nv = new Nhanvien();
        nv.inputInfo();
        nv.printInfo();
    }
}
