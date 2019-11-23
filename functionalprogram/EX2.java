                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   import java.util.Arrays;
import java.util.Arrays;
public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a[] = {0, -1, 2,-3, 1,-2,3}; 
	
		Arrays.parallelSort(a);
		int n=a.length;
		int count =0;
		for(int i=0;i<n-2;i++)
		{
			int left=i+1;
			int right=n-1;
			while(left<right)
			{
			if(a[i]+a[left]+a[right]==0 )                                                                                                                                                                                                                                                                  
			{
				System.out.println(a[i]+ ","+a[left]+","+a[right]);
				left++;
				right--;  
				count++;
			
			}
			
			else if (a[i]+a[left]+a[right]>0)
			{
				right--;
				
			}
			else
				left++;
			
			}
		}
		
		if(count==0)
		{
			System.out.println("no distinct triplets found");
		}
		else
		{
		System.out.println("no of distinct triplets are" +count);
		}
	}                                                                                                                                                                                     

}
