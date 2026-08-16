package prog17;
import java.util.Scanner;

public class calcu 
{
    public void main()
    {
        int a,b;
        int choice;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        choice=sc.nextInt();

        System.out.println("Enter the numbers");
        a=sc.nextInt();
        b=sc.nextInt();


        //process
        switch(choice)
        {
            case 1:
                {
                    System.out.println("Sum is : "+a+b);
                    break;
                }
            case 2:
                {
                    System.out.println("Difference is : "+(a-b));
                    break;

                }
            case 3:
                {
                    System.out.println("Product is : "+(a*b));
                    break;
                }
            case 4:
                {
                    System.out.println("Quotient is : "+(float)(a/b));
                    break;
                }
            default:
                {
                    System.out.println("Invalid Choice");
                    break;
                }
        }
        sc.close();
    }
}
