package prog38;
import java.util.Scanner;

public class sum_avg 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];

        }
        float avg=(float)sum/n;
        System.out.println("Sum is :"+sum);
        System.out.println("Average is :"+avg);
        sc.close();

    }
    
}
