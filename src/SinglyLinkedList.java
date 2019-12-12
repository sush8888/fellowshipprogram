
public class SinglyLinkedList {
	
	private static class ListNode  //inner class of sll...
	{
		private int data;
		private ListNode next;
		public ListNode(int data) //contructor with instance variable...
		{
			this.data=data;
			this.next=null;
			
		}
		
	}
	public ListNode insertAtBeginning(ListNode head,int data)//insertion of node at the beginning of linked list
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	public ListNode insertAtEnd(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		ListNode current=head;
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newNode;
		return head;
	}
	public int length(ListNode head)
	{
		if(head==null)
		{
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null)
		{
			count++;
		current=current.next;
	}
	return count;
	}
	
	public void display(ListNode head)//display method
	{
		if (head==null)
		{
			return;
		}
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+ "-->");
			current=current.next;
			
		}
		System.out.print(current);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ListNode head=new ListNode(10);
      ListNode second=new ListNode(8);
      ListNode third=new ListNode(1);
      ListNode fourth=new ListNode(11);
      head.next=second;
      second.next=third;
      third.next=fourth;
      
      SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
      singlyLinkedList.display(head);
      System.out.println();
      
      ListNode newHead1= singlyLinkedList.insertAtBeginning(head,100);
      singlyLinkedList.display(newHead1);
      System.out.println();
      ListNode newHead= singlyLinkedList.insertAtEnd(head,15);
      singlyLinkedList.display(newHead);
      //System.out.println("\n length of linked list is : " +  singlyLinkedList.length(head));
      
      
	}

}
