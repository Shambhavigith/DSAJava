package array;
import java.util.*;
public class ksum 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        int[] a= new int[n];
        int sum=0;
        int i=0;
        int j=0;
        int maxlen=0;

        System.out.println("enter the elements:");
        for(int x=0;x<n;x++)
        {
            a[x]=sc.nextInt();
        }

        System.out.println("Enter the key:");
        int key=sc.nextInt();

        
        while(j<n)
        {
            if(sum<key)
            {
                sum=sum+a[j];
                j++;
            }
            else if(sum>key)
            {
                sum=sum-a[i];
                i++;
            }
            else
            {
                if(maxlen<j-i)
                    maxlen=j-i;
                j++;
                sum=sum+a[j];
            }
        }

        System.out.println("the sub arrays:");

        sc.close();
    }
    
    
}
