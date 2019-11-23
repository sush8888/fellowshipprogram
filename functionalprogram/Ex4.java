import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter quadratic equation");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int delta=0;
		delta=(b*b)-(4*a*c);
		
		double root1=(-b+Math.sqrt(delta))/2*a;
		double root2=(-b-Math.sqrt(delta))/2*a;
		
		System.out.println("roots are"+root1+ " ," +root2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
