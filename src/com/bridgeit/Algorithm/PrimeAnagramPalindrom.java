package com.bridgeit.Algorithm;
import java.util.Arrays;
import java.util.HashSet;

public class PrimeAnagramPalindrom{

	public static void main(String[] args) {
int a[]=new int[169];
int k=0;
System.out.println("prime no are");

for(int i=1;i<=1000;i++)
{
int count=0;

for(int j=2;j<i;j++)
{
if(i%j==0)
{
count++;
//break;
}
}
if(count==0)
{
a[k]=i;
k++;
System.out.println(i+ " ");
}
 
}
anagram(a);
}
private static void anagram(int[] a)
{
for(int i=0;i<a.length;i++)
{
int no=a[i];
int temp[]=new  int[3];
int k=0;
while(no>0)
{
int rem=no%10;
temp[k]=rem;
k++;
no=no/10;
}
Arrays.parallelSort(temp);
int num=0;
for(int j=0;j<temp.length;j++)
{
num=num*10+temp[j];
}
a[i]=num;
}
int b[]=new int[268];
int s=0;
for(int i=0;i<a.length;i++)
{
for(int j=i;j<a.length;j++)
{
if(a[i]==a[j])
{
b[s]=a[i];
s++;
}
}
}


System.out.println();
System.out.println("Sorting no are");
removeduplicate(b);
for(int m=0;m<b.length;m++)
{
System.out.println(b[m]+ " ");
}
}
private static int[] removeduplicate(int[] b)
//here check
{
int n=b.length;
int[] temp=new int[n];
int j=0;
for(int i=0;i<n-1;i++)
{
if(b[i]!=b[i+1])
{
temp[j++]=b[i];
}
}
temp[j++]=b[n-1];
for(int i=0;i<j;i++)
{
b[i]=temp[i];
}
return b;
}
}
