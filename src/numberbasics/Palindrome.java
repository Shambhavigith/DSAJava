package numberbasics;
import java.util.*;
public class Palindrome 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int a=sc.nextInt();
        int x=a;
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev==a)
        {
            System.out.println("the number is palindrome.");
        }
        else
        {
            System.out.println("the number is not a palindrome.");
        }
        sc.close();
    }
}
