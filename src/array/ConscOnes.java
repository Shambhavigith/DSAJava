package array;
import java.util.*;
public class ConscOnes 
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
        int maxstreak=-1;
        int streak=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                streak++;
            }
            else if(a[i]==0)
            {
                if(streak>maxstreak)
                {
                    maxstreak=streak;
                }
                streak=0;
            }
        }
        if(streak>maxstreak)
        {
            maxstreak=streak;
        }
        System.out.println("the max no of 1s:");
        System.out.println(maxstreak);
        sc.close();
    }
}
