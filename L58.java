public class L58 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=6;i++)
        {
            int a=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a++);
            }
            --a;
            for(int j=2;j<=i;j++)
            System.out.print(--a);
            System.out.println();
        }    
    }
}