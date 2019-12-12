package com.bridgeit.functional;


	import java.io.File;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	public class Array2D {

		public static void main(String[] args) throws IOException {
			

			int a[][]=new int[3][3];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();
					
				}
			}
			
			File f=new File("first.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			PrintWriter pw=new PrintWriter(f);
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					pw.print(a[i][j]);
				}
		pw.println(" ");
			}
			pw.flush();
			pw.close();
			
			
			
			
			
		}

	}

