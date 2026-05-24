package basic;

import java.util.Scanner;

public class SortedArr 
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
        int prev=a[0];
        boolean flag=false;
        for(int i=1;i<n;i++)
        {
            int curr=a[i];
            
            if(curr>=prev)
            {
                prev=curr;
                continue;
            }
            else
            {
                System.out.println("Unsorted array");
                flag=true;
            }
            if(flag)
                break;
        }
        if(!flag)
            System.out.println("sorted array");
        sc.close();
    }
}
