package prog6;
import java.util.Scanner;

public class modulus 
{
    public void main()
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even ");
        }
        else
        {
            System.out.println("Odd ");
        }
        sc.close();

    }
    
}
