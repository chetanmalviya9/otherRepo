class Name{
     public void myName()
     {
          for(int i=1;i<=7;i++)
        {      
          //-------------------C
            for(int j=1;j<=7;j++)
            {
                if((i==1&&j==1)||(i==7&&j==1))
                System.out.print("  ");
                else if(j==1||i==1||i==7)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
          //for space
            for(int sp=6;sp>=1;sp--)
            System.out.print(" ");
          //------------------H
            for(int j=1;j<=7;j++)
            {
                if(i==4||j==1||j==7)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
          //for space
            for(int sp=6;sp>=1;sp--)
            System.out.print(" ");
          //------------------E
            for(int j=1;j<=7;j++)
            {
                
                if(i==4||i==1||j==1||i==7)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
          //for space
            for(int sp=6;sp>=1;sp--)
            System.out.print(" ");
          //------------------T
            for(int j=1;j<=7;j++)
            {
                if(i==1||j==4)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
          //for space
            for(int sp=6;sp>=1;sp--)
            System.out.print(" ");
          //for triangle space before A 
            for(int sp=6;sp>=i;sp--)
            System.out.print(" ");
          //-------------------A
            for(int j=1;j<=i;j++)
            {
                if(i==4||i==j||j==1)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
          //for space
            for(int sp=6;sp>=i;sp--)
            System.out.print(" ");
          //for triangle space After A 
            for(int sp=6;sp>=1;sp--)
            System.out.print(" ");
          //-------------------N
            for(int j=1;j<=7;j++)
                if(i==j||j==1||j==7)
                System.out.print(" *");
                else
                System.out.print("  ");
            System.out.println();
          }
     }
}
public class LName {
     public static void main(String[] args) {
          Name n=new Name();
          n.myName();
     }
}
