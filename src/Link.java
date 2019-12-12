import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

class Node1  //node1 class
{
String data;
Node1 next;

Node1(String data) //constructor of node1
{
this.data=data;   
this.next=null;

}
}
public class Link {   //actual class of program
	
	Node1 head;
static Link insert(Link list,String data) { //insertion operation which insert elements at last of linklist
	Node1 newNode= new Node1(data);
	newNode.next=null;
	if(list.head==null)
	{
		list.head=newNode;
	}
	else
	{
	
		Node1 last=list.head;
		while(last.next!=null)
		{
			last=last.next;
		}
	
	last.next=newNode;
	}
	return list;
}


static void displayList(Link list)
{try
{
	FileOutputStream fos=new FileOutputStream("/home/admin219/Documents/sushant-java/JavaProject/src/test.txt");
Node1 current=list.head;//storing link head into current
while(current!=null)
{
	String s=current.data+" ";//creating new string which store current data means list data in the string form
	byte b[]=s.getBytes();//take link data byte by byte
	fos.write(b); //store it into file
//System.out.println(current.data +"-->");
current=current.next; 
	
}
}catch(Exception e) {
	System.out.println(e);
	}
}
static Link deleteByValue(Link list,String value)
{
  Node1 currNode=list.head;
  Node1 prev =null;
  
  if(currNode!=null&&currNode.data.equals(value))
  {
  list.head=currNode.next;
  System.out.println("deleted :"+value);
  return list;
  }
 while(currNode!=null&&!currNode.data.equals(value))
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

static Link deleteByIndex(Link list,int index) {

	 Node1 currNode=list.head;
	 Node1 prev=null;
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

  
  
  
  
 

static void fileRead(String input)
{Link list=new Link();
	try {
	BufferedReader br=new BufferedReader(new FileReader("/home/admin219/Documents/sushant-java/JavaProject/src/test.txt"));
	
	String str;
	String array[];

	str=br.readLine();
	array=str.split("[,/\n. ?]");

	for(String s:array) {
	
	list=insert(list,s);
	
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
System.out.println("Enter word to search:");
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
fileRead(input);
sc.close();
	
	
	//Link l = new Link();
	//l.insert(l,"ram");
	//l.insert(l,"laximan");
	
	//l.displayList(l);
}
}