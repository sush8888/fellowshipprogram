package com.bridgeit.junit;
import java.util.Scanner;
public class TempConv {
	public static void main(String[] args) {
		double c,f;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temprature in farad");
		
		{
			f=sc.nextDouble();
		
		c=(f-31)*5/9;
		// f=util.TempConv(f);
		//System.out.println(c);
		}
		System.out.println("Enter Temprature in celcious");
		{
		c=sc.nextDouble();
		f=(c*9/5)+32;
		//System.out.println(f);
		
	
		}
	}
	}


