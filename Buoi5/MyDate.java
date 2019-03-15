/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5;

/**
 *
 * @author Winter
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void addYear(int year) {
        this.year += year;
    }
    
    public void addMonth(int month) {
        this.month += month;
        if (this.month > 12) {
            int years = this.month % 12;
            this.addYear(years);
            this.month = this.month / 12;
        }
    }
    public void addDay(int day) {
        this.day += day;

        switch (this.month) {
            case 2:
                if (leapYear()) {
                    if (this.day >= 29) {
                        this.addMonth(1);
                        int diff = this.day - 29;
                        this.day = 0;
                        this.addDay(diff);
                    }
                } else {
                    if (this.day >= 28) {
                        this.addMonth(1);
                        int diff = this.day - 28;
                        this.day = 0;
                        this.addDay(diff);
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31) {
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30) {
                    this.addMonth(1);
                    int diff = this.day - 30;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
        }
    }
    public void subDay(int day) {
        this.day -= day;

        switch (this.month) {
            case 2:
                if (leapYear()) {
                    if (this.day >= 29) {
                        this.addMonth(1);
                        int diff = this.day - 29;
                        this.day = 0;
                        this.subDay(diff);
                    }
                } else {
                    if (this.day >= 28) {
                        this.addMonth(1);
                        int diff = this.day - 28;
                        this.day = 0;
                        this.subDay(diff);
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31) {
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.subDay(diff);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30) {
                    this.addMonth(1);
                    int diff = this.day - 30;
                    this.day = 0;
                    this.subDay(diff);
                }
                break;
        }
    }
    public boolean leapYear(){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            return true;
        else
            return false;
    }
    public void print(int type) {
        if (type == 0) {
            System.out.printf("%d/%d/%d \n", this.day, this.month, this.year);
        } else if (type == 1) {
            System.out.printf("Ngày %d Tháng %d Năm %d \n/n", this.day, this.month, this.year);
        }
    }
}
