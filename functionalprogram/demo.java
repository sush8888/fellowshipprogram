import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0, -1, 2,-3, 1};
int count=0;
for(int i=0;i<a.length-2;i++)
{
for(int j=i+1;j<a.length-1;j++)
{
	for( int k=j+1;k<a.length;k++)
	{
		if(a[i]+a[j]+a[k]==0)
		{
			System.out.println(a[i]+ ","+a[j]+","+a[k]);
			count ++;
		}
	}
}
}

if(count==0)
{
	System.out.println("no sum found");
	
}
else
{
	System.out.println("no of sum is  "+ count);
}
}
}