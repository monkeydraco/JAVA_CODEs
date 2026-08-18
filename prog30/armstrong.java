package prog30;
import java.util.Scanner;
import java.lang.Math;


public class armstrong 
{
    public void main()
    {
        int num,n;
        int sum=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of digits in a number");
        n=sc.nextInt();

        System.out.println("Enter a number");
        num=sc.nextInt();

        int q,r;
        int t=num;
        while(num!=0)
        {
            r=num%10;
            q=num/10;
            num=q;
            sum=sum+Math.powExact(r,n);
        }

        if(sum==t)
        {
            System.out.println(t+" is a Armstrong number");
        }
        else
        {
            System.out.println(t+" is not a Armstrong number");
        }

        sc.close();

    }
    
}
