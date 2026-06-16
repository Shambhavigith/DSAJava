package array;

import java.util.*;

public class LinearSearch 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[] args)
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
        System.out.println("enter the element to be searched:");
        int key=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Element Found");
        }
        else
            System.out.println("Element not Found");
        sc.close();
    }
    
}
