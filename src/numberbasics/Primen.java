package numberbasics;
import java.util.*;
public class Primen 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter the number(1-n)");
        x=sc.nextInt();
        for(int n=1;n<=x;n++)
        {
            int flag=1;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1 && n!=1)
            {
                System.out.println(n);
            }
        }
        
        sc.close();
    }
}
