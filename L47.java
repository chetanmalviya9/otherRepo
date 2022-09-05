class PowerSum
{
   public void powerSum(int  n)
   {  int i=1,sum=0,pow,res=1;
        while(i<=n)
	{
	pow=i;
	res=1;
	while(pow!=0)
	{
	res=res*n;
	pow--;
	}
	sum=sum+res;
	i++;
	}
   	 System.out.print (" Sum of Series is = "+sum);
   }
}

class L47
{
	  public static void main (String[] args)
 	 {
  	   java.util.Scanner in = new java.util.Scanner (System.in);
   	   PowerSum loop = new  PowerSum();
	    System.out.print ("Enter number to find sum PowerSum series =");
	   int ti=in.nextInt();
	   loop. powerSum(ti);
     }
}
