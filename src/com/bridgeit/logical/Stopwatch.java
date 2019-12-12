package com.bridgeit.logical;
import java.util.Scanner;
public class Stopwatch {

	public static void main(String[] args) {
		
long start=System.currentTimeMillis();
      String str;
      Scanner scan = new Scanner(System.in);
	  
      System.out.print("Enter Your First Name : ");
      str = scan.nextLine();
	  
      System.out.print("Hello, " + str);           
	
long stop=System.currentTimeMillis();             
System.out.println("the time required to complete the above program is    " +(stop-start));
		
		
		
		scan.close();
	}

}