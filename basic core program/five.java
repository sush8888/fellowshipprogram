import java.util.Scanner;

class five
{
    public static void main(String[] args)
     {float sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)
        {
           sum=sum+(1/i);

        }
System.out.print(1);
        for(int i=2;i<=n;i++)
        {
System.out.print("+" +"1/"+i);
        }
        System.out.println(" ");

        System.out.println("harmonic series sum is "+sum);
    }
}