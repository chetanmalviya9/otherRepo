public class L5324{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=6;j>=i;j--)
            System.out.print("  ");
            for(int k=1;k<=i;k++)
           
            System.out.print("  * ");
           
            System.out.println();   
        }
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=i+1;j++)
            System.out.print("  ");
            for(int k=5;k>=i;k--)
           
            System.out.print("  * ");
           
            System.out.println();   
        }
    }
}
