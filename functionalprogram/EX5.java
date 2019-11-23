import java.util.Scanner;
public class EX5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double t= sc.nextInt();
	int v=sc.nextInt();
		
	double w=0;
	w=35.74 + (0.6215*t) +((0.4275*t-35.75)*Math.pow(v, 0.16));
	
	System.out.println(w);
	
		
		
		
		
		
		
		
		
	}
}
