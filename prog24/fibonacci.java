package prog24;
import java.util.Scanner;

public class fibonacci 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        //input
        System.out.println("Enter the value of N");
        n=sc.nextInt();
        int arr[]=new int[n+2];
        arr[0]=0;
        arr[1]=1;
        for(int i=0;i<n;i++)
        {   
            arr[i+2]=arr[i]+arr[i+1];
            System.out.print(arr[i]+"\t");
            
        }

        sc.close();


    }
    
}
