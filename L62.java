public class L62 
{
    public static void main(String[] args) 
    {
        for(char i='A';i<='D';i++)
        {
            char a=i;
            for(char j='A';j<=i;j++)
                System.out.print(j);
            for(int k='B';k<=i;k++)
                System.out.print(--a);
                System.out.println();
        }
    }    
}
