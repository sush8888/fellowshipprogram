
public class DoublyLinkedList {
	private ListNode head;   //instance variable
	private ListNode tail;
	private int length;  //it holds the length of doublylinked list

	private class ListNode { //inner class.....
		private int data;
		private ListNode next;
		private ListNode prev;

		public ListNode(int data) {//constructor of class ListNode....

			this.data = data;

		}
	}

	public DoublyLinkedList() {//constructor of public class DoublyLinkedList...
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() { //method for check weither linkedlist is empty or not 
		return length == 0;
	}

	public int length() { //this method for returns the length of doublylinkedlist

		return length;

	}
////////////////////////////////////////////////////////////////
public void insertFirst(int value)
{
	ListNode newNode= new ListNode(value);
	if(isEmpty())
	{
		tail=newNode;
	}else
	{
		head.prev=newNode;
	}
	newNode.next=head;
	
	head=newNode;
}
//////////////////////////////////////////////////////////////
	public void insertLast(int value) {

		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
		length++;
	}
	
	public void displayForward()
	{
		if(head==null)
		{
			return;
		}
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + "-->");
			temp=temp.next;
		}
		System.out.print("null");
		}
	
   public void displayBackward()
   {
	   if(head==null)
	   {
		   return;
	   }
	   ListNode temp=tail;
	   while(temp!=null)
	   {
		   System.out.print(temp.data +"-->");
		   temp=temp.prev;
	   }
	   System.out.print("null");
   }
   
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertLast(9);
		dll.insertLast(20);
		dll.insertLast(10);
		dll.insertLast(21);
		dll.insertFirst(3);
		dll.displayForward();
		System.out.println();
		dll.displayBackward();
	
	}
}
