package numberbasics;
import java.util.*;
public class Prime 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int flag=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
        if(flag==1 && n!=1)
        {
            System.out.println("A Prime number");
        }
        else
        {
            System.out.println("Not a Prime number");
        }
        sc.close();
    }
}
