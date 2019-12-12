package com.bridgeit.functional;

public class Quadratic {

	public static void main(String[] args)
	{
		 double a = 2.3, b = 4, c = 5.6;
	        double root1, root2;
	        double Delta = b * b - 4 * a * c;
	        System.out.format(" Delta%.2f \n",  Delta);
	        
	        if( Delta> 0) {
	            root1 = (-b + Math.sqrt( Delta)) / (2 * a);
	            root2 = (-b - Math.sqrt( Delta)) / (2 * a);
	            System.out.format("root1 = %.2f\n and root2 = %.2f", root1 , root2);
	        }
	       
	        else if( Delta == 0) {
	            root1 = root2 = -b / (2 * a);
	            System.out.format("root1 = root2 = %.2f;\n", root1);
	        }
	        
	        else {
	            double realPart = -b / (2 *a);
	            double imaginaryPart = Math.sqrt(- Delta) / (2 * a);
	            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
	        }
	    }
				   
}

	


