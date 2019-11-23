import java.io.PrintWriter;
import java.util.Scanner;
public class Array2D
{
static Scanner scan = new Scanner(System.in);
public static int[][] arrayInt(int m, int n)
{
int a[][] = new int[m][n];
System.out.println();
System.out.println("integer Array");

for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{

a[i][j]=scan.nextInt();
}
}
return a ;
}
}
public static void display(int[][]a)
PrintWriter pw = new Printwriter(System.out,true)
System.out.println();
