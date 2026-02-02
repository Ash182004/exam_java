package com.training.test1;

public class Q2_Date {
	private int day;
    private int month;
    private int year;

    public Q2_Date() {}

    public Q2_Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Q2_Date(Q2_Date d) {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public void input(int inputday, int inputmonth, int inputyear) {
        day = inputday;
        month = inputmonth;
        year = inputyear;
    }

   

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
    public void print() {
        System.out.println(toString());
    }
}
