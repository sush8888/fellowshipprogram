package com.bridgeit.Algorithm;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		permutation(str,0,length);
		
		
		
		
		
		
		
		
	}
int start;
	private static void permutation(String str, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				str=swap(str,start,i);
				permutation(str,start+1,end);
				str=swap(str,start,i);
			}
		}
		
		
		
	}
	private static String swap(String str, int start, int i) {
		// TODO Auto-generated method stub
		char a[]=str.toCharArray();
		char temp;
		temp=a[start];
		a[start]=a[i];
		a[i]=temp;
		  return String.valueOf(a);  
	}

	

}
