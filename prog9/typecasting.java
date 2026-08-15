package prog9;
import java.util.Scanner;

public class typecasting 
{
    public void main()
    {
        //Implicit type casting in Java
        float quo;
        Scanner sc=new Scanner(System.in);
        int dividend;
        float divisor;
        System.out.println("Enter the Dividend");
        dividend=sc.nextInt();
        System.out.println("Enter theb Divisor");
        divisor=sc.nextFloat();

        quo=dividend/divisor;
        System.out.printf("Quotient is : %.2f\n",quo);


        //explicit type casting in java
        int result=(int) quo;
        System.out.println("Result after casting is : "+result);
        sc.close();

    }
    
}
