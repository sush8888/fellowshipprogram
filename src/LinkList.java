import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Node2  //Node2 class
{
	
int data;
Node2 next;

Node2(int data) //constructor of Node2
{
this.data=data;   
this.next=null;

}
}
public class LinkList {   //actual class of program
	
	Node2 head;
static LinkList insert(LinkList list,int data) { //insertion operation which insert elements at last of linklist
	Node2 newNode= new Node2(data);
	newNode.next=null;
	if(list.head==null)
	{
		list.head=newNode;
	}
	else
	{
	
		Node2 last=list.head;
		while(last.next!=null)
		{
			last=last.next;
		}
	
	last.next=newNode;
	}
	return list;
}


static void displayList(LinkList list)
{try
{
	FileOutputStream fos=new FileOutputStream("/home/admin219/Documents/sushant-java/JavaProject/src/test.txt");
Node2 current=list.head;//storing LinkList head into current
while(current!=null)
{
	String s=current.data+" ";//creating new string which store current data means list data in the string form
	byte b[]=s.getBytes();//take LinkList data byte by byte
	fos.write(b); //store it into file
//System.out.println(current.data +"-->");
current=current.next; 
	
}
}catch(Exception e) {
	System.out.println(e);
	}
}
static LinkList deleteByValue(LinkList list,int value)
{
  Node2 currNode=list.head;
  Node2 prev =null;
  
  if(currNode!=null&&currNode.data==value)
  {
  list.head=currNode.next;
  System.out.println("deleted :"+value);
  return list;
  }
 while(currNode!=null&&currNode.data!=value)
 {
	 prev =currNode;
    currNode=currNode.next;
    
 }
 if(currNode!=null)
 {	 
	prev.next=currNode.next;
    System.out.println(value+ "  found and deleted   ");
}
if(currNode==null)
{
System.out.println(value+"  not found  ");
insert(list,value);
}
return list;
}

static LinkList deleteByIndex(LinkList list,int index) {

	 Node2 currNode=list.head;
	 Node2 prev=null;
	 if(index==0&&currNode !=null)
	 {
	list.head=currNode.next;
	System.out.println(index+ " index data deleted ");
	return list;
	 }
	 int count=0;
	 while(currNode!=null)
	 {
		 if(count==index)
	 
	 {
		 prev.next=currNode.next;
	 System.out.println(index+ "index data deleted");
	 break;
	 }else {
		 prev=currNode;
		 currNode=currNode.next;
		 count++;
	 }
	 }
	 if(currNode==null)
	 {
		 System.out.println(index+ "index data deleted");
		 }
	 
	 return list;
}

  
  
  
  
 

static void fileRead(int input)
{LinkList list=new LinkList();
	try {
	BufferedReader br=new BufferedReader(new FileReader("/home/admin219/Documents/sushant-java/JavaProject/src/test.txt"));
	
	String str;
	String array[];

	str=br.readLine();
	array=str.split("[,/\n. ?]");
	
	for(String s:array) {
		// Integer.parseInt(s);
	list=insert(list, Integer.parseInt(s));
	//List<String> al = new ArrayList<String>();
	//al = Arrays.asList(s);
//int arr[]= {'s'};
int[] arr = new int[Integer.parseInt(s)];
int temp;
for(int i=0 ;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if (arr[i] > arr[j]) 
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
	}
}
	}
	//insert(list,input);
	displayList(list);
	
	System.out.println("\n......");
	deleteByValue(list,input);
	displayList(list);
	br.close();

	}
	catch(Exception e) {
	System.out.println(e);
	}
//FileOutputStream fos;
//StringBuffer sb=new StringBuffer("");
//for(String st:list) {
//	
//fos=new FileOutputStream( "/home/admin219/Documents/sushant-java/JavaProject/src/test.txt",true);
//				byte[] b=st.getBytes();
//				fos.write(b);	}

}
public static void main(String[] args) {
	
	
	//FileOutputStream fos;
System.out.println("Enter no to search:");
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();
fileRead(input);
sc.close();
	
	
	//LinkList l = new LinkList();
	//l.insert(l,"ram");
	//l.insert(l,"laximan");
	
	//l.displayList(l);
}
}