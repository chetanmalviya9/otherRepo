import javax.lang.model.util.ElementScanner6;

public class L79Q 
{
    public static void main(String[] args) {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if((i==1&&j==1)||(i==7&&j==1)||(i==1&&j==7)||(i==7&&j==7))
                System.out.print("  ");
                else if(j==1||i==1||i==7||j==7)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        } 
        for(int i=1;i<=3;i++)
        {
            for(int sp=1;sp<=3;sp++)
            System.out.print("  ");
            for(int j=1;j<=3;j++)
            if(i==j)
            System.out.print(" *");
            else 
            System.out.print("  ");
            System.out.println(); 
        }
    }    
}
