package numberbasics;
import java.util.*;
public class Count 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        int x;
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number:");
        x=sc.nextInt();
        if(x==0)
        {
            count=1;
        }
        else
        {
            while(x!=0)
            {
                x=x/10;
                count++;
            }
        }
        System.out.println("digits in your number:"+count);
        sc.close();
    }
    
}
