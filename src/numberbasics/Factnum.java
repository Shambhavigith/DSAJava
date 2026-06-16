package numberbasics;
import java.util.*;
public class Factnum
{
    public static void main(String args[])
    {
        int n;
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number:");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Any non zero integer");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            System.out.println("factors count:"+count);
        }
        sc.close();
    }
}
