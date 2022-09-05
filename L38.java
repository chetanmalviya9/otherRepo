import java.util.Scanner;

class SumofRange
 {
   public void sumofRange(int  n)
   {  int sum=0;
      for(int i=1;i<=n;i++)
	sum+=i;
	System.out.print((sum)+"  ");
   }
 }

   public class L38
    {
	  public static void main (String[] args)
 	 {
  	   Scanner in = new Scanner (System.in);
   	   SumofRange loop = new SumofRange();
	    System.out.print ("Enter number to print SumofRanger=");
	   int t=in.nextInt();
	  loop.sumofRange(t);
         }
     }
