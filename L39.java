import java.util.Scanner;

class SumofEvenRange
 {
   public void sumofevenRange(int  n)
   {  int sum=0;
      for(int i=1;i<=n;i+=2)
	sum+=i;
	System.out.print("Even Number sum "+(sum));
   }
 }

  public class L39
    {
	  public static void main (String[] args)
 	 {
  	   Scanner in = new Scanner (System.in);
   	   SumofEvenRange l = new SumofEvenRange();
	    System.out.print ("Enter number to print Sum of even Range=");
	   int t=in.nextInt();
	  l. sumofevenRange(t);
         }
     }
