public class L79K 
{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i+j==5||j==1)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=2;i<=4;i++)
            {
                for(int j=1;j<=4;j++)
                if(i==j||j==1)
                System.out.print(" *");
                else
                System.out.print("  ");
                System.out.println();
            }
    }
}
