public class L57 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==6||i==j||j==1)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }    
    }
}
