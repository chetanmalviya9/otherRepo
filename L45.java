class PrimeNum
{
     public void primeNum(int n)
     {  boolean bo=true;
          for(int i=2;i<n/2;i++)
       if(n%i==0)
       {
       bo=false;
       break;
       }
       if(bo==true)
           System.out.print (" Given number is Prime Number = "+n);
       else
          System.out.print (" Given number is not Prime Number = "+n); 
       
     }
   }
  
     class L45
      {
         public static void main (String[] args)
         {
            java.util.Scanner in = new java.util.Scanner (System.in);
             PrimeNum loop = new  PrimeNum();
           System.out.print ("Enter number to check Prime or not =");
          int ti=in.nextInt();
         loop. primeNum(ti);
           }
       }
  