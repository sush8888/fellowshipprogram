
public class SinglyLinkedListSorted {
	
	private ListNode head;
	
	private  class ListNode{
	
		private int data;
		private ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	public void insertAtBeginnig(int data)
	{
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;	
	}
	public void insertAtLast(int data)
	{
		ListNode newNode=new ListNode(data);
		ListNode last=head;
		while(null!=last.next)
		{
			last=last.next;
			last.next=newNode;
			
		}
				
	}
	public ListNode getMiddleNode()
	{
		if(head==null)
		{
			return null;
		}
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr !=null && fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public void PrintLinkedList()
	{
		if(head==null)
		{
			System.out.println(" null ");
		}
		ListNode current=head;
		while(null!=current)
		{
			System.out.print(current.data+ "-->");
			current=current.next;
		}
		System.out.println(" null ");
	}
	public void removeDuplicate() {
		
		if(head==null)
		{
			return;
		}
		ListNode current =head;
		while(current!=null&&current.next!=null)
		{
			if(current.data==current.next.data)
				{
				current.next=current.next.next;
			}else {
				
			
			current=current.next;
			}
		}
	}
	public ListNode inserInSortedList(int value)
	{
		ListNode newNode= new ListNode(value);
		if(head==null)
		{
			return newNode;
		}
		ListNode current= head;
		ListNode temp=null;
		while(current!=null&&current.data<newNode.data)
		{
			temp=current;
			current=current.next;
		}
		newNode.next=current;
		return head;
		
	}
	public static void main(String[] args) {
		
		SinglyLinkedListSorted sll=new SinglyLinkedListSorted();
		sll.insertAtBeginnig(9);
		sll.insertAtBeginnig(8);
		sll.insertAtBeginnig(7);
		sll.insertAtBeginnig(5);
		sll.PrintLinkedList();
		sll.inserInSortedList(12);
		sll.PrintLinkedList();
		sll.inserInSortedList(11);
		sll.PrintLinkedList();
		sll.inserInSortedList(11);
		sll.PrintLinkedList();
		
		
	   
		sll.removeDuplicate();
		sll.PrintLinkedList();
		ListNode middle=sll.getMiddleNode();
   System.out.println("middle element is  " + middle.data);
  

	}

}
