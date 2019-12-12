package com.bridgeit.functional;
import java.util.Scanner;
import java.lang.Math;
public class Edistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();

		double distance=Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2));
		System.out.println(distance);
			//ut.println("Edistance from (" + x + ", " + y + ") to (0, 0) = " + Edist);

	}

}
