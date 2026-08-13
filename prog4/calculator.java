package prog4;
import java.util.Scanner;

public class calculator
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a =sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();

        //calculations
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        float quo=(float)a/b;
        int rem=a%b;

        System.out.println("Sum : "+sum);
        System.out.println("Diff: "+diff);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
            

    }
}