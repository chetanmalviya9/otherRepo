public class L78 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int sp=5;sp>=i;sp--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }  
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<=i+1;sp++)
            System.out.print(" ");
            for(int j=4;j>=i;j--)
            System.out.print(" *");
            System.out.println();
        }
    }    
}
