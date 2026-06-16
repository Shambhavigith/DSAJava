package array;
import java.util.*;
public class Intersection
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements for first array:");
        int n=sc.nextInt();
        System.out.println("Enter the no of elements for second array:");
        int m=sc.nextInt();

        int[] a= new int[n];
        int[] b= new int[m];
        int[] u= new int[m+n];

        System.out.println("enter the elements of first array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the elements of second array:");
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        while((i<n)&&(j<m))
        {
            if(a[i]==b[j])
            {
                if((k==0)||(u[k-1]!=a[i]))
                {
                    u[k]=a[i];
                    k++;
                }
                i++;
                j++;
            }
            else
            {
                if(a[i]<b[j])
                {
                    i++;
                }
                else
                {
                    j++;
                }

            }

        }
        System.out.println("array after intersection:");
        for(int x=0;x<k;x++)
        {
            System.out.println(u[x]);
        }
        sc.close();
    }
}