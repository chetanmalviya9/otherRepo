public class L5312{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
          
            for(int k=6;k>=i;k--)
            if(i==k||i==1||k==6)
            System.out.print("*");
            else
            System.out.print(" ");
            System.out.println();   
        }
    }
}
