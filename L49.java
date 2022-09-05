class PrimeNum
 {
   public void primeNum(int  n)
   {  boolean bo=true;
	int j=2;
	while(j<=n)
	{
	bo=true;
        for(int i=2;i<=j/i;i++)
	{
	if(j%i==0)
	{
	bo=false;
	break;
	}
	}
	if(bo==true)
   	 System.out.println (" Given number is Prime Number = "+j);
	 j++;
	}
	
   }
 }

   class L49
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   PrimeNum loop = new  PrimeNum();
	    System.out.print ("Enter number to Prime Series range =");
	   int ti=in.nextInt();
	  loop. primeNum(ti);
         }
     }
