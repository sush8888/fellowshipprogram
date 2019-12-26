package datastructureSushant.N;

import java.util.Scanner;

public class BankingCashCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue ql = new Queue();
		int choice, usercount = 0;
		String name;
		char c1; 
		do {
			System.out.println("Press 1. Enter into Line");
			System.out.println("press 2. Process Deposit / withdrow");
			System.out.println("press 3. to show How many people in the row remaining");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				usercount++;
				System.out.println("Add the user" + usercount + " into line");
				System.out.println("Enter the Username :");
				name = sc.next();
				ql.enQueue(usercount, name);
				break;
			case 2:
				ql.dequeue();
				break;
			case 3:
				ql.show();
				break;
			default:
				System.out.println("Enter the Valid Cases :");
			}
			System.out.println("Size is :" + ql.getSize());
			//CLS.clearScreen();
			System.out.println("Do you want to continue:....Press Y or y");
			c1 = sc.next().charAt(0);
			
		} while (c1 == 'y' || c1 == 'Y');
		sc.close();
	}
	
	
}