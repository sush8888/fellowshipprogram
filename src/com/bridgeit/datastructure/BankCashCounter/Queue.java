package datastructureSushant.N;

import java.util.Scanner;

public class Queue {
	Scanner sc = new Scanner(System.in);
	public Node front, rear;
	public int size = 0;
	static int bankamount = 500;

	Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	public int deposit() {

		int amount;
		System.out.println("Enter the Ammount :");
		amount = sc.nextInt();
		if (amount > 500) {
			bankamount = bankamount + amount;
		} else {
			System.out.println("Please Enter the Amount >= 500");
			deposit();
		}
		return bankamount;
	}

	public int widtdraw() {
		int amount;
		System.out.println("Enter the Ammount :");
		amount = sc.nextInt();
		if (amount < bankamount) {
			bankamount = bankamount - amount;
		} else {
			System.out.println("Please enter the amount < " + bankamount);
			widtdraw();
		}
		return amount;
	}

	public void enQueue(int no, String name) {
		Node n = new Node();
		n.setNo(no);
		n.setName(name);
		n.setNext(rear);

		if (front == null) {
			front = n;
			rear = n;
			n.setNext(rear);
		} else {
			rear.setNext(n);
			rear = n;
			rear.setNext(null);
		}

		size++;
		System.out.println("user " + rear.getNo() + " :" + rear.getName() + " has added.......please next!!!! ");
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty");
		} else {
			Node t;
			t = front;
			System.out.println("Enter the user " + t.getNo() + " choice :");
			System.out.println("1. Deposit :");
			System.out.println("2. Widthrow : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				deposit();
				front = front.getNext();
				System.out.println("please next!!!! ");
				size--;
				System.out.println("Amount is : " + bankamount);
				break;
			case 2:
				if (widtdraw() > 0) {
					front = front.getNext();
					size--;
					System.out.println("Amount is : " + bankamount);
					System.out.println("please next!!!! ");
				} else {
					System.out.println("Not Have enough cash..Please Deposit First....!!!!!!:");
				}
				break;
			default:
				System.out.println("Enter valid  choice :");
			}
		}

	}

	public int getSize() {
		return size;

	}

	public void show() {
		Node t;
		t = front;
		if (front == null) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Next User is : " + front.getName());

			System.out.println("User List .................");

			while (t != rear) {
				System.out.println(" User " + t.getNo() + " : " + t.getName());
				t = t.getNext();
			}
			System.out.println(" User " + t.getNo() + " : " + t.getName());
		}
	}

}