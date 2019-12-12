package com.bridgeit.Algorithm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;


public class InsertionSort {
	
   
	public static void main(String[] args) throws IOException
	{
		String[] str2 = readfile();
		
		insertionSort(str2);

	}
	private static void insertionSort(String[] str2)
	//private static void insertionSort(String[] str2)
	{  
		     int i,j;
	           String key= " ";
		for( i=1;i<str2.length;i++)
		{
		
		     key = str2[i];
		     //j=j-1;
		
		     for(j=i-1; j>=0 &key.compareTo(str2[j])<0 ;j--)
		 {
			 str2[j+1]=str2[j];
		 //j--;
		 }
		 str2[j+1]=key;
	}
		
	//System.out.print(str3[]);
	}
	private static String[] readfile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		String str=" ";
		File f=new File("insertion.txt");
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
