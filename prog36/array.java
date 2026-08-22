package prog36;
import java.util.Scanner;



public class array 
{
    public void main()
    {
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+" array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
    
}
