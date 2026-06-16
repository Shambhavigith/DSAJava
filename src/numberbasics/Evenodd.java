package numberbasics;
import java.util.*;
public class Evenodd 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        int x,num;
        int cEven=0;
        int cOdd=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number:");
        x=sc.nextInt();
        if(x==0)
        {
            cOdd=0;
            cEven=1;
        }
        else
        {
            while(x!=0)
            {
                num=x%10;
                x=x/10;
                if(num%2==0)
                {
                    cEven++;
                }
                else
                {
                    cOdd++;
                }
            }
        }
        System.out.println("Even digits in your number:"+cEven);
        System.out.println("Odd digits in your number:"+cOdd);
        sc.close();
    }
}
