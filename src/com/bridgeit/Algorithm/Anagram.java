package com.bridgeit.Algorithm;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		String s1,s2;
		int i,j;
		int found=0,not_found=1;
		System.out.println("Enter the Strings");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		if(s1.length()!=s2.length())
		{
		System.out.println("Enter the proper String"  );
		}
		for(i=0;i<s1.length()-1;i++)
		{
			for(j=0;j<s2.length()-1;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					found=1;
					break;
				}else
				{
					not_found=0;
				}
				
			}
			found++;
		}
			if(not_found==1)
			{
				System.out.println("string is not anagram" );
			}
			else
			{
				System.out.println("string is anagram\n" +s1 + " and " + s2 );
			}
			}
			
		}
		
	


