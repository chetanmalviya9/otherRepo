public class L63 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=6;i++)
        {
            int a=i;
            for(int sp=6;sp>=i;sp--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int k=2;k<=i;k++)
                System.out.print(--a);
                System.out.println();
        }
    }    
}
