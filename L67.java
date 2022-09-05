public class L67 
{
    public static void main(String[] args) 
    {int a=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            if(j!=1)
            System.out.print("*"+a++);
            else
            System.out.print(a++);
            System.out.println();
        }
        
        int b=a;
        for(int i=4;i>=1;i--)
        {
            a=b-i;
            b=a;
            for(int j=1;j<=i;j++)
            if(j!=1)
                System.out.print("*"+a++);
                else
                System.out.print(a++);
            System.out.println();
        }
    }
}