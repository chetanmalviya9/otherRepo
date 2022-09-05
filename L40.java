class SumofSeries
 {
   public void sumofSeries(int  n)
   {  int sum=0;
      for(int i=1;i<=n;i++)
	{
	if(i%2==1)
	{
	System.out.print(i+"-");
	sum+=i;
	}
	else{
	sum-=i;
	System.out.print(i+"+");
	}
	}
	System.out.print("\nSum of the series is "+sum);
   }
 }

   class L40
    {
	  public static void main (String[] args)
 	 {
  	   Scanner in = new Scanner (System.in);
   	   SumofSeries l = new SumofSeries();
	    System.out.print ("Enter number to print Sum of + - Series=");
	   int t=in.nextInt();
	  l. sumofSeries(t);
         }
     }
