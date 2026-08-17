package prog25;
import java.util.Scanner;
public class prime 
{
    public void main()
    {
        int n;
        int flag=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        n=sc.nextInt();

        //process
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }

        }

        if(flag==1)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }

        sc.close();
    }
    
}
