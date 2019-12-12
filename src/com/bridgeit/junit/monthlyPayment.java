package com.bridgeit.junit;
import java.util.Scanner;
public class monthlyPayment {
 
	public static void main(String[] args) {
		System.out.println("enter the value of p && y &&r");
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int Y=sc.nextInt();
		int R=sc.nextInt();
		double n=12*Y;
		double r=R/(12*100);
		double payment= P*r/1-(1+r)*(-n);
		System.out.println(payment);

	}

}
