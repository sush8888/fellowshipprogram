package com.bridgeit.Algorithm;

public class MergeSort {

	public static void main(String[] args) {
		



	String s[]= {"Sushant","Akshay","Rahul", "Prathmesh", "Harshal", "Tushar", "Bharat", "Ovi","Eshwari"};
	int n=s.length-1;
	sort(s,0,n);
		
		
		
		for(int a=0;a<s.length;a++)
		{
			System.out.print(s[a]+ " ");
		}
		
	}

	private static void sort(String[] s,int beg,int end) 
	{
		// TODO Auto-generated method stub

		if(beg<end)
		{
			int mid=(beg+end)/2;
			sort(s,beg,mid);
			sort(s,mid+1,end);
			merge(s,beg,mid,end);
		 }
		
		}

	private static void merge(String[] s, int beg, int mid, int end) {
		// TODO Auto-generated method stub
		int left=mid-beg+1;
		int right=end-mid;
		String l[]=new String[left];
		String r[]=new String[right];
		
		for(int i=0;i<left;i++)
		{
			l[i]=s[beg+i];
		}
		for(int j=0;j<right;j++)
		{
			r[j]=s[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=beg;
		while(i<l.length && j<r.length)
		{
			if(l[i].compareTo(r[j])<=0)
			 {
				s[k]=l[i];
				i++;
				k++;
				
			 }
			else
			 {
				s[k]=r[j];
				j++;
				k++;
			   }
			
		      }
		while(i<l.length)
		{
			s[k]=l[i];
			i++;
			k++;
		}
		
	while(j<r.length)
	{
		s[k]=r[j];
		j++;
		k++;
	}
	
	
	}

}