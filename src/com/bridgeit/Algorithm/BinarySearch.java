package com.bridgeit.Algorithm;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

     
     String[] str2 =readfile();
     Scanner sc=new Scanner(System.in);
     System.out.println(" ");
     System.out.println("enter the string which you want to search");
     String search=sc.nextLine();
     binarySearch(str2,search);
     
     
     
     
     
     
}

	private static boolean binarySearch(String[] str2, String search) {
		// TODO Auto-generated method stub
		int left=0;
		int right=str2.length-1;
		int mid;
		while(left<right)
		{
			mid=(left+right)/2;
			if(str2[mid].equals(search))
			{
				System.out.println("string found");
				return true;
			}
			else if(search.compareTo(str2[mid])<0)
			{
				right=mid;
				
			}
			else
			{
				left=mid+1;
			}
		}
		
		
		System.out.println("no such string found");
		return false;
		
		
		
	}

	private static String[] readfile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		String str=" ";
		File f=new File("first.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			str=str+sc.nextLine();
			str=str+ " ";
		
		}
		System.out.println(str);
		
		String s[]=str.split(" ");
		Arrays.parallelSort(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
			System.out.print(" ");
			
		}
		
		
		
		return s;
	}
}