package array;
import java.util.*;
public class MoveZeroes 
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
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[index]=a[i];
                index++;
            }
        }
        for(int i=index;i<n;i++)
        {
            a[i]=0;
        }
        System.out.println("the array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
