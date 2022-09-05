public class L539{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=i;j++)
            if(i==j||i==6||j==1)
            System.out.print("*");
            else
            System.out.print(" ");   
            System.out.println();   
        }
    }
}
