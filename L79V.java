public class L79V 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=13;j++)
            {
                if(j==i||i+j==14)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }    
    }        
}
