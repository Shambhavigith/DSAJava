package array;
import java.util.*;
public class Duplicate 
{

    @SuppressWarnings({"ConvertToTryWithResources", "UnnecessaryContinue"})
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
        for(int i=1;i<n;i++)
        {
            if(a[i]==a[i-1])
            {
                continue;
            }
            else
            {
                a[index+1]=a[i];
                index++;
            }

        }
        System.out.println("the sorted array:");
        for(int i=0;i<index+1;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
