package prog40;
import java.util.Scanner;

public class counteo 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else 
            {
                odd++;
            }
        }
        System.out.println("No of odds is : "+odd);
        System.out.println("No of evens is : "+even);
        sc.close();
    }
    
}
