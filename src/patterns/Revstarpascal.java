import java.util.Scanner;
public class Revstarpascal 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int i,j,n,k;

        System.out.println("Enter the no. of lines:");
        n=sc.nextInt();

        for(i=n;i>=1;i--)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(k=2*i-1;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
