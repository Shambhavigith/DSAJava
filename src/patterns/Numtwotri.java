import java.util.Scanner;
class Numtwotri

{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int i,j,n;

        System.out.println("enter the number of lines:");
        n=sc.nextInt();


        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
