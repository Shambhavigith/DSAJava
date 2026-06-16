package numberbasics;
import java.util.*;
public class Factors 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number:");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Any non zero integer");
        }
        else
        {
            System.out.println("factors:");
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }   
}
