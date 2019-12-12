package com.bridgeit.basic;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		 
		        System.out.println("enter the no");
		        Scanner sc=new Scanner(System.in);
		        int no=sc.nextInt();
		        int count=0;
		        while(no>0)
		        {
		            count++;
		            no=no/10;
		        }
		if(count==4)
		{
		     if((no%4==0 && no%100==0 ) && (no%400==0))
		    {
		     System.out.println("it is leap year");

		    }
		    else if(no%4==0 && no%100!=0)
		    {
		        System.out.println("its leap year");
		    }

		    else{
		        System.out.println("its not leap year");
		    }
		}

		    else
		    {
		        System.out.println("enter valid no");
		    }




	}
	

		    }
		



	


