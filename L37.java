import java.util.Scanner;

class Fibbonacci{
    public void fibbonacci(){
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            n=sc.nextInt();
        }while(n<0);
        int m=0,m2=0;
        int m1=1;
        for(int i=1;i<n;i++)
        {
            System.out.println(m2);
            m=m1+m2;
            m2=m1;
            m1=m;
        }
    }
}
class L37
{
    public static void main(String args[])
    {
        new Fibbonacci().fibbonacci();
    }
}