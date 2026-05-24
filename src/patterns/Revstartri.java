import java.util.Scanner;

class Revstartri 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int i,j,n;

        System.out.println("enter the number of lines:");
        n=sc.nextInt();

        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        sc.close();
    }
}

    