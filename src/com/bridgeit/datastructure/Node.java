package datastructureSushant.N;

public class Node {
	int no;
	private String name;
	private Node next;

	Node() {
		no = 0;
		name = null;
		next = null;
	}

	Node(String name, Node next, int no) {
		this.no = no;
		this.name = name;
		this.next = next;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	/*
	 * public int getAmount() { return amount; }
	 * 
	 * public void setAmount(int amount) { this.amount = amount; }
	 */

}