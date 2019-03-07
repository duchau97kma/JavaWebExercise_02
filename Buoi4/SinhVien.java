/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai3;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class SinhVien {
    private String maSV,lanThi;
    private double diemTB;
    private boolean dkHDSE,vpNQ;
    public SinhVien() {
    }

    public SinhVien(String maSV, String lanThi, double diemTB, boolean dkHDSE, boolean vpNQ) {
        this.maSV = maSV;
        this.lanThi = lanThi;
        this.diemTB = diemTB;
        this.dkHDSE = dkHDSE;
        this.vpNQ = vpNQ;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLanThi() {
        return lanThi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public boolean isDkHDSE() {
        return dkHDSE;
    }

    public boolean isVpNQ() {
        return vpNQ;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setLanThi(String lanThi) {
        this.lanThi = lanThi;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDkHDSE(boolean dkHDSE) {
        this.dkHDSE = dkHDSE;
    }

    public void setVpNQ(boolean vpNQ) {
        this.vpNQ = vpNQ;
    }

   
    
    public void inputInfo()
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập mã SV:");
        setMaSV(sr.nextLine());
        System.out.println("Số lần sv thi:");
        setLanThi(sr.nextLine());
        System.out.println("Nhập điểm sv:");
        setDiemTB(sr.nextDouble());
        
        System.out.println("SV có đăng kí khóa học không?");
        setDkHDSE(sr.nextBoolean());
        System.out.println("SV có vi phạm nội quy không?");
        setVpNQ(sr.nextBoolean());
    }
    public void show()
    {
        System.out.println("Sinh viên đạt HB:"+this.datHB());
    }
    public boolean datHB()
    {
        if(this.isDkHDSE())
            return true;
        if(this.isVpNQ())
            return false;
        else
        return false;
        
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.inputInfo();
        System.out.println("==============");
        sv.show();
    }
}
