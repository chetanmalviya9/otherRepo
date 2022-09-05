class ReverseNumber
 {
   public void reverseNumber(int  n)
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
	
   	 System.out.println (j+" reverse is = "+rev);
	 j++;
	}
	
   }
 }

   class L50
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   ReverseNumber loop = new  ReverseNumber();
	    System.out.print ("Enter number to Reverse Series range =");
	   int ti=in.nextInt();
	  loop. reverseNumber(ti);
         }
     }
