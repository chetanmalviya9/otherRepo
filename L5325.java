import javax.lang.model.util.ElementScanner6;

public class L5325{
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++)
        {
            for(int j=1;j<=6;j++)
            if(i==j||i+j==7)
            System.out.print("*");
            else
            System.out.print(" ");
            System.out.println();   
        }
    }
}
