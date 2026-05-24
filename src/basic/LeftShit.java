package basic;
import java.util.*;

public class LeftShit 
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
        int hehe=a[0];
        for(int i=1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        a[n-1]=hehe;
        System.out.println("array after left shift:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
    
}
