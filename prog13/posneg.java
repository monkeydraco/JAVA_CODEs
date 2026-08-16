package prog13;
import java.util.Scanner;

public class posneg 
{
    public void main()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        //input
        System.out.println("Enter the number");
        num=sc.nextInt();

        //process
        if(num>0)
        {
            System.out.println("Number is positive");
        }
        else if(num<0)
        {
            System.out.println("Number is negative");

        }
        else if(num==0)
        {
            System.out.println("Number is zero");
        }

        sc.close();
    }
    
}
