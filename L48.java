class NumbyFactorialSeries
 {
   public void numbyFactorialSeries(int  n)
   { 
	int fact=1;
	float sum=0;
     for(int i=1;i<=n;i++)
      {
	fact=1;
	for(int j=i;j>=1;j--)
	{
	 fact*=j;
   	}
	 System.out.print (i+"/"+fact+"+");
	 sum+=i/fact;
      }
	 System.out.println ("sum of Number by factorial series is"+sum);
   }
 }

   class L48
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   NumbyFactorialSeries loop = new  NumbyFactorialSeries();
	    System.out.print ("Enter number to find Num by Factorial Series ");
	   int t=in.nextInt();
	  loop. numbyFactorialSeries(t);
         }
     }
