import java.util.Scanner;
class OddNumber{
    public void oddNumber(){

        Scanner sc =new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter n");
            n=sc.nextInt();
        }   while(n<1);
        for(int i=1;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}
public class L34
{
    public static void main(String[] args) {
       OddNumber obj=new OddNumber();
       obj.oddNumber();
    }
}
