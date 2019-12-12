package com.bridgeit.junit;
import java.util.Scanner;
public class VendingMachine {
	static int i=0;
  	static int total=0;

	  static int notes[]= {2000,500,200,100,50,20,10,5,2,1};
	static int m;
	
	public static  int calculate(int m,int[]notes )
	{
		int rem;
		if(m==0)
		{
			return -1;
		}
		else
		
			if(m>=notes[i])
			{
			int calnote = m/notes[i];
		    rem=m%notes[i];
		    m=rem;
		    total=total+calnote;
		    System.out.println(notes[i]+   " Notes ---> " +calnote);
	
		}
		i++;
		return calculate(m, notes);
	}


	public static void main(String[] args) {
		System.out.print("Enter the Amount:");
		Scanner sc= new Scanner(System.in);
		m =sc.nextInt();
		VendingMachine.calculate(m,notes);
		System.out.println("Total Number of Notes are :"+total);

	}

}
