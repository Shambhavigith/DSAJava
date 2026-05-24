package basic;
import java.util.*;

public class Largestelem 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        int[] a= new int[n];

        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the largest element is:");
        int large=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        System.out.println(large);
        sc.close();
    }
    
}
