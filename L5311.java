public class L5311{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" ");
            for(int k=6;k>=i;k--)
            if(i==k||i==1||k==6)
            System.out.print("*");
            else
            System.out.print(" ");
            System.out.println();   
        }
    }
}
