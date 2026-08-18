package prog27;
import java.util.Scanner;

public class palindrome 
{
    public void main()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();


        int q;
        int r;
        int rev=0;
        int temp=num;
        while(num!=0)
        {
            r=num%10;
            q=num/10;

            num=q;
            rev=rev*10+r;

        }

        if(temp==rev)
        {
            System.out.println("Number is a Palindrome number");
        }
        else
        {
            System.out.println("Number is not a Palindrome number ");
        }
        sc.close();

    }
    
}
