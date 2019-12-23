package datastructureSushant;

public class StackLinkedList
{
	private Node top;
	private int length;
	
	private class Node
	
	{
		private	 int data;
		private Node next;
		
	public Node(int data)
	
		{
			this.data=data;

		}
	
	}
	public StackLinkedList()
	{
		top=null;
		length=0;
	}
	public int  length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public void push(int data)
	
	{
		Node temp = new Node(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
  public int pop() 

  { 
	 
	if(isEmpty())	
	{
		System.out.println(" empty Stack");
	}
	
	int result=top.data;
	top=top.next;
	length--;
	return result;
}
  public int peek()
  {
	  if(isEmpty())	
		{
			System.out.println("empty Stack");
	
		}
	  return top.data;
  }
	public static void main(String[] args) {
		StackLinkedList lls=new StackLinkedList();
		
		;
		char[] ch="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		int i=0;int j=0;int p=0;int k=0;
		//int count=0;
		while(i!=ch.length)
		{
			if(ch[i]=='(')
			{
				lls.push('9');
				p++;
			}
			i++;
		}
		
		while(j!=ch.length&&p!=k)
		{
			if(ch[j]==')')
			{
				lls.pop();
				k++;
			}
			j++;
		}
		if(lls.isEmpty()&&i==j)
		{
			System.out.println("parenthesis is balanced");
		}
		else
		{
			System.out.println("parenthesis not balanced");
		}			
//		lls.push(20);
//		lls.push(25);
//		lls.push(29);
//		System.out.println(lls.peek());
//		lls.pop();
//		System.out.println(lls.peek());
	}

}
