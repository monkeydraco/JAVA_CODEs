package prog21;
import java.util.Scanner;

public class numbers 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");

        //input
        n=sc.nextInt();

        //process
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"\t");
        }

        sc.close();


    }
    
}
