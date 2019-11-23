
class second
{
    public static void main(String args[])
    {
        char a[]={'T','F','T','T','F','F','F'};
        
    int countT=0;
    int countH=0;
for(int j=0;j<a.length;j++)
  {
  if(a[j]=='T')

    countT++;
else

   countH++;

}

System.out.println(countT);
System.out.println(countH);

int n=a.length;

float t=(countT*100)/n;
float h=(countH*100)/n;


if(t>h)
System.out.println("tail percentage is greater  "+t);
else
System.out.println("head percentage is greater  "+h);








    }
}
