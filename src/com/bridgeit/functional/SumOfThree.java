package com.bridgeit.functional;

class SumOfThree
{
 static void findTriplets(int[] arr,int n)
{
int  count=0;
boolean found=true;
for(int i=0; i<n-2; i++)
 {
    for(int j=i+1; j<n-1; j++)
   {
      for(int k=j+1;k<n;k++)
    {
      if(arr[i]+arr[j]+arr[k] == 0)
   
   
    {
   count++;
    System.out.print(arr[i]);
    System.out.print(" ");
    System.out.print(arr[j]);
    System.out.print(" ");
    System.out.print(arr[k]);
    System.out.print("\n");
    found = true;
  System.out.println("  number of triplets are " +count);
    
      }
    }
  }
 }


   if(found == false)
 
  System.out.println("does not exits");
  
}
  public static void main(String[] args)
 {// int static  count=0;
   int arr[]={-3,-2,-1,0,1,2,3};
   int n=arr.length;
  findTriplets(arr,n);

}
}

