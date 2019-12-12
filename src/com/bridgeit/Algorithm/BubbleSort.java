package com.bridgeit.Algorithm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) throws IOException 
	{    Integer a[]= readfile();
		 Scanner sc=new Scanner(System.in);
		 bubbleSort(a);
		 
	} 
	public static<T extends Comparable<T>> T[]  bubbleSort(T[] a)  {
		int i,j;
		int count ;
		
		for(i=0;i<a.length-1;i++)
		{
			count=0;
			for(j=0;j<(a.length-i)-1;j++)
				if(a[i].compareTo(a[j])<0)
			{
				T temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				count=1;
			}
			
		
			
			if(count==0)
			{
				break;
			}
		}
			System.out.println(" ");
			for( i=0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}
			return a;
			
	}
		
		
		

	
	private static Integer[] readfile() throws IOException {
		// TODO Auto-generated method stub

		int i=0;
		Integer p[]=new Integer[15];
		File f=new File("bubble.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextInt())
		{
			p[i] = sc.nextInt();
		
		}
		System.out.print(p[i]+ " ");
        i++;
        sc.close();
		return p;
     }

		
		
		
}	


