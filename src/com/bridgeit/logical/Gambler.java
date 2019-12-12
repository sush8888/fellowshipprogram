package com.bridgeit.logical;

import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		
System.out.println("enter Stake,goal,trials value");

Scanner sc=new Scanner(System.in);
int stake=sc.nextInt();      
int goal=sc.nextInt();      
int trial=sc.nextInt();     


int bet=0;    
int win=0;     

for(int i=0;i<trial;i++)
{
	int cash=stake;
while(cash>0 && cash<goal)
	{
	
		if(Math.random()>0.5)
			cash++;
		else                     
			cash--;
		if(cash==goal)
			win++;
		
	}
}


System.out.println(win+ "  wins of  "+ trial );

double win_percentage=(100*win)/trial;
System.out.println("percentage of win  " +win_percentage);

double loss_percentage=(100-win_percentage);
System.out.println("loss percentage  "+ loss_percentage);



	}

}