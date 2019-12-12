package com.bridgeit.Algorithm;
import java.util.Scanner;
public class GuessNo {
	static Scanner s=new Scanner(System.in);
	
	static int find()
	
	{
		int low=0,high=127,mid;
		while(low!=high)
		{
			mid=(low+high)/2;
			System.out.println("Enter 1 if no is between " + low + " - " + mid + " \nEnter 2 if no is between " + (mid+1) + " - " + high);
		int c=s.nextInt();
		mid=(low+high)/2;//127/2=63 ,mid=63,1>(0-63),2>(64-127),
		if(c==1)
		{
			high=mid;//if 1 then high=63
		}	
			else
			{
				low=mid+1;//if 2 then low=63+1=64;
		}
		
		}
		return low;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("guess a no between 0 to  127");
		s.next();
		try
		{
			System.out.println("guessed no is" +find());
		}catch(Exception e)
		{
		System.out.println(" Enter corrret input");
		}

	}

}
