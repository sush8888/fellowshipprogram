import java.util.Scanner;
public class Coupon {

	public static void main(String[] args) {
		
int count=0;          
int distinct=0;          
		System.out.println("enter the range of random no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean b[] =new boolean[no];         
		                                      
		while(distinct<no)                    
		 {
			 int value=(int) (Math.random()*no);
			 count++;
			 if(!b[value])    
			 {                                   
				 distinct++;
				 b[value]=true;
				 
			 }
		}
		
		 
		 System.out.println("to get all the random no we try  " +count+ "  times");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
