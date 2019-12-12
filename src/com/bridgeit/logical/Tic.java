package com.bridgeit.logical;
import java.util.Scanner;
import java.util.Random;

public class Tic {
	private static final char XXX ='X';
	private static final char OOO ='O';
	private static final char X = 0;
	private static final char O = 0;
	private static final char Y = 0;
	private static final char p = 0;
	private static final char s = 0;
	private static String user =" ";
    static char a[]= {'1','2','3','4','5','6','7','8','9'};
    public static void gamename()
    {
    	System.out.print("\n\n\t\t\t tic-tac-toe");
    }
    public static void show()
    {
    	System.out.println("\n\n\t\t|"+"----" +"|"+"----" +"|"+"----" +"|");
		System.out.println("\t\t|"+"  "+a[0]+" " +"|"+"  "+a[1]+" " +"|"+"  "+a[2]+" "+"|");
		System.out.println("\t\t|"+"----" +"|"+"----" +"|"+"----" +"|");
			

		System.out.println("\t\t|"+"  "+a[3]+" " +"|"+"  "+a[4]+" " +"|"+"  "+a[5]+" "+"|");
		System.out.println("\t\t|"+"----" +"|"+"----" +"|"+"----" +"|");
			

		System.out.println("\t\t|"+"  "+a[6]+" " +"|"+"  "+a[7]+" " +"|"+"  "+a[8]+" "+"|");
		System.out.println("\t\t|"+"----" +"|"+"----" +"|"+"----" +"|");
			
    
    }
    
    
    
    
    public static void main(String[] args) 
    {
	
		gamename();
		show();
		check();
		
		
		
int k=0;		
int count=0;
while(count<9)
{ count++;
	if(user=="computer")
	{
		play();
		user="user";
	}
	else
	{
		computer();
	user = "computer";
	}
	show();
	 char win=end();
			System.out.println(" ");
			
	if(win==XXX)
	{ k=1;
		 System.out.println("    X symbol user win!!!!!!!!!");   // X symbol user win then it will break all this loop and print
		 break;
	}
	if(win==OOO)
	{k=1;
		 System.out.println("   O symbol user win!!!!!!!!!!!");
		 break;
	}
	if(k==1)      //means one of the player is win so break the loop
		break;
	}	
			
	if(count==9)    //if none of the player win then count will be 9 then just print game draw
			{
				System.out.println("game draw");
			
			}
    }
	

	

private static void check()
{
Scanner sc=new Scanner(System.in);
System.out.println("do you want to play first Y|N");
char c= sc.next().charAt(0);
System.out.print(" ");
if(c=='N' |c=='n')
{
	user="computer";
	computer();
	
}
else
{ user="user";                                 //else it will call the play function
	play();
	
}
/*Scanner sc1=new Scanner(System.in);
System.out.println("do you want to play Again Y|N");
char b=sc1.next().charAt(0);
if(b=='Y' |b== 'y')
{
	play();
}
else
{
	System.out.println("good bye...!");
}
*/
}
private static char end() {                   //this function will check if anyone of them is win or not
	
	// TODO Auto-generated method stub
	if(a[0]=='X' && a[1]=='X' && a[2]=='X')
	return XXX;
	else if(a[0]=='O' && a[1]=='O' && a[2]=='O')
	return OOO;
	
	
	else if(a[3]=='X' && a[4]=='X' && a[5]=='X')
		return XXX;
	else if(a[3]=='O' && a[4]=='O' && a[5]=='O')
		return OOO;
	
	
	else if(a[6]=='X' && a[7]=='X' && a[8]=='X')
		return XXX;
	else if(a[6]=='O' && a[7]=='O' && a[8]=='O')
		return OOO;
	

	else if(a[0]=='X' && a[3]=='X' && a[6]=='X')
		return XXX;
	else if(a[0]=='O' && a[3]=='O' && a[6]=='O')
		return OOO;
	
	
	
	else if(a[1]=='X' && a[4]=='X' && a[7]=='X')
		return XXX;
	else if(a[1]=='O' && a[4]=='O' && a[7]=='O')
		return OOO;
	
	
	else if(a[2]=='X' && a[5]=='X' && a[8]=='X')
		return XXX;
	else if(a[2]=='O' && a[5]=='O' && a[8]=='O')
		return OOO;
	
	
	else if(a[0]=='X' && a[4]=='X' && a[8]=='X')
		return XXX;
	else if(a[0]=='O' && a[4]=='O' && a[8]=='O')
		return OOO;
	
	
	else if(a[2]=='X' && a[4]=='X' && a[6]=='X')
		return XXX;
	else if(a[2]=='O' && a[4]=='O' && a[6]=='O')
		return OOO;
	
	else
	return 0;
	
	
	
	
	
}

private static void play()
{
	System.out.println("Enter the position no");
	Scanner sc=new Scanner(System.in);
	char p=sc.next().charAt(0);
	System.out.println("");
	check(p);
	
}
private static void computer()
{
	
	
	Random rd=new Random();
int d=0;
		while(d<50){
			   int randomno = (int)( 9* Math.random()+1);
       if(a[randomno]!='X' && a[randomno]!='O')
       {
    	   a[randomno]='O';
    	   break;
       }
			   
       System.out.println( "");	   
			   
			   }
		
}
private static void check(char p) {
	          
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==p)
		{
			a[i]='X';
			
		}
		
	}
	/*Scanner sc1=new Scanner(System.in);
	System.out.println("do you want to play Again Y|N");
	char b=sc1.next().charAt(0);
	if(b=='Y' |b== 'y')
	{
		
	}
	else
	{
		System.out.println("good bye...!");
	}
	*/
}
	}
	
	