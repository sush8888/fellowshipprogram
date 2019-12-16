

public class Singlylist {
	//node head;
	int counter=0;
		private static class node
		{
			private	 int data;
			private node next;
		public node(int data)
			{
				this.data=data;
				this.next=null;
			}
		//node head;
		}
		public node insertAtBeginnig(node head,int data)
		{
			node newNode= new node(data);
			if(head==null)
			{
				return newNode;
			}
			
				newNode.next=head;
			   head=newNode;
			   return head;
		}
		public node insertAtLast(node head,int data)
		{
			node newNode= new node(data);
			node last=head;
			while(null!=last.next)
				last=last.next;
			    last.next=newNode;
			return head;
		}
		public void displayMethod(node head)
		{
			if(head==null)
			{
				return;
			}
			node current=head;
			
			while(current!=null)
			{
			System.out.print(current.data+ "-->");
			current=current.next;
			counter++;
		}
			System.out.print(current+","+counter);
		}
//		public int length(node head)
//		{  
//			if(head==null)
//			{
//				return 0;
//			}
//			int count=0;
//			node size=head;
//			while(size!=null)
//			{
//				count++;
//				size=size.next;
//			}
			
			
		
//			return count;
//		}
		public node insertAtPosition(node head,int data,int position)
		{ 
			node newNode= new node(data);
			node prev=null;
			node currNode=head;
			int count1=1;
			while(count1<position-1)
			{
				prev=currNode;
				currNode=currNode.next;
				count1++;
				
			}
			//node current=prev.next;
			prev.next=newNode;
			newNode.next=currNode;
			
					
			return head;
		}
		public node deleteAtPosition(node head,int data,int position)
		{
			node newNode=new node(data);
			node prev=head;
			int count=1;
			while(count<position-1)
			{
				prev=prev.next;
				count++;
			}
			node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			return null;
			}
			
		 public void findMiddle(node head,int data,int count)
		 {  int  mid=0;node  prev=null;
			 if(counter%2==0)
				 
			 {
				  mid=(counter/2)+1;
			 }
			 node current=head;
			 for(int i=1;i<=mid;i++)
			 {
				  prev=current;
				 current=current.next;
			 } prev.next=current.next;
		 }
		
		public static void main(String[] args) {
			
			Singlylist s1 = new Singlylist();
			node head=new node(10);
	        node second =new node(12);
	        node third=new node(15);
	      node fourth=new node(20);
	     
//     s1.displayMethod(head);
//      System.out.println();
//	        
	        head.next=second;
	        second.next=third;
	        third.next=fourth;
	        s1.displayMethod(head);
	      System.out.println();
        node newHead1= s1.insertAtBeginnig(head,100);
	        s1.displayMethod(newHead1);
       System.out.println();
	        node newHead2= s1.insertAtLast(head,200);
	        node newHead3=s1.insertAtPosition( head, 17, 3);
	        s1.displayMethod(newHead3);
	        System.out.println();
       node newHead4=s1.deleteAtPosition( head, 200, 6);
        s1.displayMethod(head);
	        System.out.println();

	        
		}

	}






