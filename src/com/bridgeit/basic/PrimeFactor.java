package com.bridgeit.basic;
import java.util.Scanner;
public class PrimeFactor {
	 public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();  
	for(int i=1;i<n*n;i++)
	{
	    if(n%i==0)
	    {
	        System.out.println(i);
	    }
	}
	    }


}
