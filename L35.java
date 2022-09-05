import java.util.Scanner;
class EvenNumber{
    public void evenNumber(){
        Scanner sc =new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter n");
            n=sc.nextInt();
        }while(n<2);
        for(int i=2;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}
public class L35 
{
    public static void main(String[] args) {
        new EvenNumber().evenNumber();
    }
}
