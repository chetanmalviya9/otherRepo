class Factorial
 {
   public void factorial(int  n)
   {  int fact=1;
      for(int i=n;i>=1;i--)
	fact*=i;
    System.out.print (n+" Factorial = "+fact);
   }
 }

class L41
{
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner sc = new java.util.Scanner (System.in);
   	   Factorial obj = new Factorial();
	    System.out.print ("Enter number to print Factorial=");
	   int t=sc.nextInt();
	  obj. factorial(t);
         }
}
