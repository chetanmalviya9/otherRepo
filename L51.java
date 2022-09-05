class PolindromeSeries
 {
   public void polindromeSeries(int  n)
     { 
	int j=11,rev,co;
	while(j<=n)
	{
	co=j;
	rev=0;
       while(co>0)
	{
	rev=rev*10+co%10;
	co=co/10;

	}
	if(j==rev)
   	 System.out.println (j+" Polindrome Number is = "+rev);
	 j++;
	}
	
   }
 }
   class L51
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   PolindromeSeries loop = new  PolindromeSeries();
	    System.out.print ("Enter number to Polindrome Series range =");
	   int ti=in.nextInt();
	  loop. polindromeSeries(ti);
         }
     }
