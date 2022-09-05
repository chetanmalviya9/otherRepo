import java.util.Scanner;
class Count{
    public void count(){
        Scanner sc =new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter n");
            n=sc.nextInt();
        }while(n<1);
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
public class L33 
{
    public static void main(String[] args) {
        new Count().count();
    }
}
