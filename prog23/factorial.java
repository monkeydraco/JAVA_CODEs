package prog23;
import java.util.Scanner;

public class factorial 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value ");
        n=sc.nextInt();

        int result;
        result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;
        }

        System.out.println("Factorial of "+n+" is "+result );

        sc.close();


    }
    
}
