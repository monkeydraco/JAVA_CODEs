package prog39;
import java.util.Scanner;

public class reverse 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size ");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }

        for(int i=0;i<n/2;i++)
        {
            a[i]=a[i]+a[n-1-i];
            a[n-1-i]=a[i]-a[n-1-i];
            a[i]=a[i]-a[n-1-i];
            System.out.println(a[i]+" and "+a[n-1-i]);

        }
        sc.close();

        System.out.println("\nArray elements reversed are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
