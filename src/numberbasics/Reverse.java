package numberbasics;

import java.util.*;
public class Reverse 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int x=sc.nextInt();
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        System.out.println("the reverse:"+rev);
        sc.close();
    }
    
}
