package com.company;

public class Main {

    public static void main(String[] args) {
	double x=0;
	double y=0;
	boolean c;
	c = y>0 && y<=4 && Math.abs(x)<=2 || y<=0 && y>=-3 && Math.abs(x)<=4;
	System.out.println(c);
    }
}
