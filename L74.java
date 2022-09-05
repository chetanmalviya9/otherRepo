public class L74 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            int a=i;
            for(int sp=5;sp>=i;sp--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=2;k<=i;k++)
            System.out.print(--a);
            System.out.println();
        }
    }
}
