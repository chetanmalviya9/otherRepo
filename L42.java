class ReverseNum
 {
   public void reverseNum(int  n)
   {  	int rev=0;
	while(n!=0)
	{
	rev=rev*10+n%10;
	n=n/10;
	}
    System.out.print (" reverse = "+rev);
   }
 }

   class L42
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner sc = new java.util.Scanner (System.in);
   	   ReverseNum obj = new ReverseNum();
	    System.out.print ("Enter number to print Reverse Number =");
	   int t=sc.nextInt();
	  obj. reverseNum(t);
         }
     }
