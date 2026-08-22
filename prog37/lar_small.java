package prog37;
import java.util.Scanner;

public class lar_small 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int large=0;
        int small=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[large])
            {
                large=i;
            }
            if(arr[i]<arr[small])
            {
                small=i;
            }

        }

        System.out.println("Largest number is "+arr[large]+" at index "+large );
        System.out.println("Smallest number is "+arr[small]+" at index "+small);

        sc.close();

    }
    
}
