public class L79J 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if((i==7&&j<4)||i==1||j==4||(i==6&&j==1))
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println(); 
        }
    }
}
