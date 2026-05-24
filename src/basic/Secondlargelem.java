package basic;
import java.util.*;
public class Secondlargelem 
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
        System.out.println("the second largest element is:");
        int large=a[0];
        int secondlarge=-1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>large)
            {
                secondlarge=large;
                large=a[i];
            }
            if((a[i]>secondlarge)&&(a[i]<large))
            {
                secondlarge=a[i];
            }
        }
        System.out.println(secondlarge);
        sc.close();
    }
    
}
