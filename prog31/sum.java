package prog31;
import java.util.Scanner;


public class sum 
{
    
    public void main()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;

        }

        System.out.println("Sum of number upto "+num+" is "+sum);

        sc.close();
    }
}
