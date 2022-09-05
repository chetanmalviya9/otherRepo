class Armstrong
 {
   public void armstrong(int  n)
   {  	int arms=0,temp=n,rem=0;
	while(n!=0)
	{
	rem=n%10;
	arms+=rem*rem*rem;
	n=n/10;
	}
 	if(arms==temp)
   	 System.out.print (temp+" Given number is Armstrong = "+arms);
	else
   	 System.out.print (temp+" Given number is not Armstrong = "+arms);
   }
 }

   class L44
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   Armstrong loop = new  Armstrong();
	    System.out.print ("Enter number to check Armstrong or not =");
	   int ti=in.nextInt();
	  loop. armstrong(ti);
         }
     }
