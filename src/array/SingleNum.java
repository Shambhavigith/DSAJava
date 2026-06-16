package array;
import java.util.*;
public class SingleNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        int[] a= new int[n];
        int x=0;

        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            x=x^a[i];
        }
        System.out.println("the number with single occurence:"+x);

        sc.close();
    }
}
