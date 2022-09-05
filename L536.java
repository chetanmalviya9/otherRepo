public class L536{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" ");
            for(int k=1;k<=6;k++)
            if(k==1||k==6||i==1||i==6)
            System.out.print("*"); 
            else
            System.out.print(" ");
            System.out.println();   
        }
    }
}
