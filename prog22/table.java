package prog22;
import java.util.Scanner;

public class table 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of TABLE");
        n=sc.nextInt();

        //process
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }

        sc.close();

    }

    
}
