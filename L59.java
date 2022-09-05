public class L59 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=6;i++)
        {
            for(int sp=6;sp>=i;sp--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                if(i==6||j==i||j==1)
                System.out.print(" "+j);
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
