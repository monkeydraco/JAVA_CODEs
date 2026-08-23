package prog42;
import java.util.Scanner;

public class linearsearch 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        n=sc.nextInt();

        System.out.println("Enter the array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int target=sc.nextInt();
        int flag=0;
        int foundAt=0;

        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                foundAt=i;
                flag=1;
                break;
            }

        }
        sc.close();
        if(flag==1)
        {
            System.out.println(target+" found at index"+foundAt);
        }
        else
        {
            System.out.println(target+" not found ");
        }


    }
    
}
