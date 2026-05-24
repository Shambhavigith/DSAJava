import java.util.Scanner;

class Rect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int i,j,n,m;

        System.out.println("enter the number of lines:");
        n=sc.nextInt();

        System.out.println("enter the number of characters:");
        m=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        sc.close();
    }
    
}