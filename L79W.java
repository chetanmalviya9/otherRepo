public class L79W 
{
    
    public static void main(String[] args) 
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(j==i||i+j==14&&i>=4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int k=4;k<=13;k++)
            if(i==k&&i>=4||i+k==14)
            System.out.print("*");
            else
            System.out.print(" ");
            System.out.println();
        }    
        
    }        
}
