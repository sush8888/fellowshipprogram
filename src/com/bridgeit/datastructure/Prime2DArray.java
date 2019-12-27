package datastructureSushant;
import java.util.Scanner;

public class Prime2DArray {

	public static void main(String[] args)
	{
//	   int aa[]=new int[500];
		int a[][]=new int[10][100];
		Scanner sc=new Scanner(System.in);
	int x=0;
		for(int k=2;k<=1000;k++)
		{			int count=0;
				
				for(int m=2;m<k;m++)
				{
				if(k%m==0)
				{
				count++;
				//break;
				}
				}
				
           if(count==0)
           {
        	   a[k/100][x]=k;
        	   
        	   if (x==a[k/100].length-1) 
        		   x=0;
        	   else
        		   x++;

           }
          
		}
		for (int i=0;i<a.length;i++)
          {
       	   for(int j=0;j<a[i].length;j++)
       	   {
       		   if(a[i][j]>0)
       		   {
       			   System.out.print(a[i][j]+ " ");
       		   }
       	   }
       	   System.out.println();
          }
		sc.close();
	}
}
   
     
		        
				
	     
   		




