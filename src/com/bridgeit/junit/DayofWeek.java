package com.bridgeit.junit;
import java.util.Scanner;
public class DayofWeek {
	public static void main(String[] args)
	{
		Scanner  sc =new Scanner(System.in);
	boolean go=true;
	
	while(go)
	{
		System.out.println("month");
		int m=sc.nextInt();
		if(m<1 || m>12)
		{
			System.out.println("month are between 1 & 12");
			continue;
		}
	
	
        System.out.println("Day");
        int d=sc.nextInt();
        if(d<1 ||d>31)
    {
    	System.out.println( "day are between 1 & 31");
    	continue;
    }
        System.out.println("Year");
        int y=sc.nextInt();
        if(y<-10000 ||y>10000)
        {
        	System.out.println("year are between -10000 & 10000");
        }
        int y1 =y -(14-m)/12;
        int x =y1 + y1/4-y1/100 + y1/400;
        int m1=m +12*((14-m)/12)-2;
        int d1=(d+x+(31*m1))/12%7;
        boolean c = 0 <= d1 && d1<= 6;
      /*  if(c)
        {
             String b = "Sunday";
              } else 
            	  if(c)
            	  {
            		  String b="monday";
        }
            	  else
            		  if (c) {
            String b = "tuesday";
          } else if (c) {
              String b = "wednesday";
            } else if (c) {
                String b = "thursday";
            } else 
            	if (c) {
                    String b = "friday";
                  } else 
                	  if (c) {
                          String b = "saturday";
                        } else
                        {
                        	System.out.println("invalid");
                        }
        System.out.println("Day of week is:");
	}
	*/
        switch(d1)
        {
        case 1:
        	System.out.println("Sunday");
        	break;
        case 2:
        	System.out.println("monday");
        	break;
        case 3:
        	System.out.println("tueday");
        	break;
        case 4:
        	System.out.println("wednesday");
        	break;
        	case 5:
            	System.out.println("thurday");
            	break;
        	case 6:
            	System.out.println("friday");
            	break;
        	case 7:
            	System.out.println("Satday");
            	break;
            	default:
            	{
            		System.out.println("invalid");
            	}
        	
            	//return(d1);
        }
        //return(d1);
	}
	
	
	
		
	}
}
		

	


