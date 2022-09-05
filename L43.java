class Polindrome
 {
   public void polindrome(int  n)
   {  	int pol=0,temp=n;
	while(n<0)
	{
	pol=pol*10+n%10;
	n=n/10;
	}
 	if(pol==temp)
   	 System.out.print (temp+" Given number is polindrome = "+pol);
	else
   	 System.out.print (temp+" Given number is not polindrome = "+pol);
   }
 }

   class L43
    {
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   Polindrome loop = new  Polindrome();
	    System.out.print ("Enter number to check polindrome or not =");
	   int ti=in.nextInt();
	  loop. polindrome(ti);
         }
     }
