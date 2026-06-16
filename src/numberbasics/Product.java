package numberbasics;
import java.util.*;
public class Product
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int x=sc.nextInt();
        int prod=1;

        while(x!=0)
        {
            prod=prod*(x%10);
            x=x/10;
        }
        System.out.println("The product of all digits is="+prod);
        sc.close();
    }
}
