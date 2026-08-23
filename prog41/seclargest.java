package prog41;
import java.util.Scanner;

public class seclargest 
{
    public void main()
    {
        int large=0;
        int seclarge=0;
        Scanner sc =new Scanner(System.in);
        int n;

        System.out.println("Enter array size");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[large])
            {
                seclarge=large;
                large=i;

            }
            else if(arr[i]>arr[seclarge])
            {
                seclarge=i;

            }
        }

        System.out.println("Second largest is : "+arr[seclarge]);
        
    }
    
}
