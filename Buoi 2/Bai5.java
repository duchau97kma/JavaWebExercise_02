/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Bai5 {

    public static float S1(int n) {
        float S1 = 0;
        for (int i = 1; i <= n; i++) {
            S1 = S1 + (float) 1 / i;
        }
        return S1;
    }

    public static int S2(int n) {
        int S2 = 0;
        for (int i = 1; i <= n; i++) {
            S2 += i;
        }
        return S2;
    }

    public static int S3(int n) {
        int S3 = 0;
        for (int i = 1; i <= n; i++) {
            S3 += Math.pow(i, 2);
        }

        return S3;
    }

    public static float S4(int n) {
        float S4 = 0;
        for (int i = 1; i <= n; i++) {
            S4 += (float) 1 / (2 * i);
        }
        return S4;
    }

    public static float S5(int n) {
        float S5 = 0;
        for (int i = 1; i <= n; i++) {
            S5 += (float) 1 / (2 * i + 1);
        }
        return S5;
    }

    public static float S6(int n) {
        float S6 = 0;
        for (int i = 1; i <= n; i++) {
            S6 += (float) 1 / (i * (i + 1));
        }
        return S6;
    }

    public static float S7(int n) {
        float S7 = 0;
        for (int i = 0; i < n; i++) {
            S7 += (float) (2 * i + 1) / (2 * i + 2);
        }

        return S7;
    }

    public static int S8(int n) {
        int S8 = 0, gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            S8 += gt;
        }
        return S8;
    }

    public static int S9(int n, int x) {
        int S9 = 0;
        for (int i = 1; i <= n; i++) {
            S9 += Math.pow(x, i);
        }
        return S9;
    }

    public static int S10(int n, int x) {
        int S10 = 0;
        for (int i = 1; i <= n; i++) {
            S10 += Math.pow(x, (2 * i));
        }
        return S10;
    }

    public static int S11(int n, int x) {
        int S11 = 0;
        for (int i = 0; i < n; i++) {
            S11 += Math.pow(x, (2 * i + 1));
        }
        return S11;
    }

    public static float S12(int n) {
        float S12 = 0, S = 0;
        for (int i = 1; i <= n; i++) {
            S += i;
            S12 += (float) 1 / S;
        }
        return S12;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
//        System.out.println("Nhập vào n=");
//        System.out.println("Nhập vào x=");
//        int x = sr.nextInt();
//        int n = sr.nextInt();

        int select = 0;

        do {
            System.out.println("1.Tính hàm S1");
            System.out.println("2.Tính hàm S2");
            System.out.println("3.Tính hàm S3");
            System.out.println("4.Tính hàm S4");
            System.out.println("5.Tính hàm S5");
            System.out.println("6.Tính hàm S6");
            System.out.println("7.Tính hàm S7");
            System.out.println("8.Tính hàm S8");
            System.out.println("9.Tính hàm S9");
            System.out.println("10.Tính hàm S10");
            System.out.println("11.Tính hàm S11");
            System.out.println("12.Tính hàm S12");
            System.out.println("Nhập vào hàm muốn tính:");
            int sl = sr.nextInt();
            switch (sl) {
                case 1:
                    System.out.println("Nhập vào n1=");
                    int n1 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S1(n1));
                    break;
                case 2:
                    System.out.println("Nhập vào n2=");
                    int n2 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S2(n2));
                    break;
                case 3:
                    System.out.println("Nhập vào n3=");
                    int n3 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S3(n3));
                    break;
                case 4:
                    System.out.println("Nhập vào n4=");
                    int n4 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S4(n4));
                    break;
                case 5:
                    System.out.println("Nhập vào n5=");
                    int n5 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S5(n5));
                    break;
                case 6:
                    System.out.println("Nhập vào n6=");
                    int n6 = sr.nextInt();
                    System.out.println("Kết quả S1=" + S6(n6));
                    break;
                case 7:
                    System.out.println("Nhập vào n7=");
                    int n7 = sr.nextInt();
                    System.out.println("Kết quả S7=" + S7(n7));
                    break;
                case 8:
                    System.out.println("Nhập vào n8=");
                    int n8 = sr.nextInt();
                    System.out.println("Kết quả S8=" + S8(n8));
                    break;
                case 9:
                    System.out.println("Nhập vào n9=");
                    int n9 = sr.nextInt();
                    System.out.println("Nhập vào x=");
                    int x9 = sr.nextInt();
                    System.out.println("Kết quả S8=" + S9(n9, x9));
                    break;
                case 10:
                    System.out.println("Nhập vào n10=");
                    int n10 = sr.nextInt();
                    System.out.println("Nhập vào x10");
                    int x10 = sr.nextInt();
                    System.out.println("Kết quả S10=" + S10(n10, x10));
                    break;
                case 11:
                    System.out.println("Nhập vào n11=");
                    int n11 = sr.nextInt();
                    System.out.println("Nhập vào x11=");
                    int x11 = sr.nextInt();
                    System.out.println("Kết quả S11=" + S11(n11, x11));
                    break;
                case 12:
                    System.out.println("Nhập vào n12=");
                    int n12 = sr.nextInt();
                    System.out.println("Kết quả S12=" + S12(n12));
                    break;
                default:
                    System.out.println("Không hợp lệ!");
                    break;
            }
            System.out.println("Bạn có muốn chọn lại?");
            select = sr.nextInt();
        } while (select != 0);

    }
}
