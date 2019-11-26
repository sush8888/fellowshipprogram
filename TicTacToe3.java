
import java.util.Random;
import java.util.Scanner;
public class TicTacToe3 {
	
	private static final char XXX ='X';
	private static final char OOO ='O';
	private static final char X = 0;
	private static final char O = 0;
	private static final char Y = 0;
	private static final char p = 0;
	private static final char s = 0;
	private static String user =" ";
	
	static char a[]= {'1','2','3','4','5','6','7','8','9'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("     TIK TAK TOE");
		System.out.println(" ");
		System.out.println(" ");
		
		
	 show();
	check();
	show();
	
	
	
int count=0;
int k=0;

while(count<8)
{count++;
if(user=="computer")                  //while loop call play and computer function 9 time 
{
	play();             
	user="user";
}
else
{
	computer();
	user="computer";
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

	

	
 private static void check() {                                 //this function will check if user want to play first
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("you want to play first ? say Y/N");
		char c= sc.next().charAt(0);
		
		System.out.println(" ");                         //if no then it will call the computer function
		if(c=='N')
		{
			user="computer";
			computer();
			
		}
		else
		{ user="user";                                 //else it will call the play function
			play();
		}
		
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


	private static void show()
                                         //it is used to display square
 
	{
		// TODO Auto-generated method stub
		System.out.println("|"+"----" +"|"+"----" +"|"+"----" +"|");
		System.out.println("|"+"  "+a[0]+" " +"|"+"  "+a[1]+" " +"|"+"  "+a[2]+" "+"|");
		System.out.println("|"+"----" +"|"+"----" +"|"+"----" +"|");
			

		System.out.println("|"+"  "+a[3]+" " +"|"+"  "+a[4]+" " +"|"+"  "+a[5]+" "+"|");
		System.out.println("|"+"----" +"|"+"----" +"|"+"----" +"|");
			

		System.out.println("|"+"  "+a[6]+" " +"|"+"  "+a[7]+" " +"|"+"  "+a[8]+" "+"|");
		System.out.println("|"+"----" +"|"+"----" +"|"+"----" +"|");
			
	}

	private static void play() {                //it will take position no from user and call the check function
		// TODO Auto-generated method stub
		
		System.out.println(" enter the position  no ");
		Scanner sc=new Scanner(System.in);
		 char  p = sc.next().charAt(0);
		System.out.println( "");
		 
		check(p);
		
		
	}
	
	private static void computer()
	{
		// TODO Auto-generated method stub
		Random rd=new Random();
	int d=0;
			while(d<50){
				   int randomno = (int)(9 * Math.random()+1);
           if(a[randomno]!='X' && a[randomno]!='O')
           {
        	   a[randomno]='O';
        	   break;
           }
				   
           System.out.println( "");	   
				   
				   }
			}
	
	private static void check(char p) {
		// TODO Auto-generated method stub            //it will search the pos and place users symbol
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==p)
			{
				a[i]='X';
			}
			
		}
		
		
			
				
				
				
				
				
				
				
				
				
		
		}
	}


