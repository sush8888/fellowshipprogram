package com.bridgeit.functional;
import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		double temp, ws,wc = 0;
		
		
		System.out.print("Enter a temperature in range between -58 and 41 :");
		{
		 temp =s.nextDouble();
		}
		System.out.print("Enter a windspeed greater than 3 :");
		{
		 ws=s.nextDouble();
		}
		 
		 if(temp<-58 || temp>41)
			 
		 {
			 System.out.print("you enter temprature is invalid");
		 }
		 if(ws<3)
			 
		 {
			 System.out.print("you enter speed is invalid"); 
		 }
	     else
			  
	    	 wc = 35.74 + 0.6215 * temp - 35.75 * Math.pow(ws, 0.16) + 0.4275 * temp * Math.pow(ws, 0.16);
            System.out.print("The wind chill index is :" +wc);
			 
	}

}
