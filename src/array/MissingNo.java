package array;
import java.util.*;
public class MissingNo 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        int digit;
        int total=0;
        int sum=0;
        int[] a= new int[n];

        for(int i=1;i<=n+1;i++)
        {
            total=total+i;
        }

        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        digit=total-sum;
        System.out.println("the missing number is:"+ digit);
    
        sc.close();

    }
}
