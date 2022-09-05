public class L5319{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" ");
            for(int k=6;k>=i;k--)
            if(i==1||i==k||k==6)
            System.out.print(" *");
            else
            System.out.print("  ");
            System.out.println();   
        }
    }
}
