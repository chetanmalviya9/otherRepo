import java.util.Scanner;
class Table{
    public void table(){
        Scanner sc =new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter n");
            n=sc.nextInt();
        }while(n<1);
        for(int i=1;i<=n;i++)
        {
            System.out.println(i*i);
        }
    }
}
public class L36 
{
    public static void main(String[] args) {
      new  Table().table();
    }
}
