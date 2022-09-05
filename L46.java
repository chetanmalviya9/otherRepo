class PowerofNumber
 {
   public void powerofNumber(int  n,int pow)
   { 
       int res=1;
	while(pow!=0)
	{
	res=res*n;
	pow--;
	}
	
   	 System.out.print (" Result of Given number is = "+res);
	
   }
 }

   class L46
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   PowerofNumber loop = new  PowerofNumber();
	    System.out.print ("Enter number to find ");
	   int t=in.nextInt();
	   System.out.print ("Enter Power of Number =");
	   int pow=in.nextInt();
	  loop. powerofNumber(t,pow);
         }
     }
