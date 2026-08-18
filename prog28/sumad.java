package prog28;
import java.util.Scanner;
import java.lang.Math;

public class sumad 
{
    public void main()
    {
        int num,n;
        int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of digits");
        n=sc.nextInt();

        System.out.println("Enter the "+n+" digit number ");
        num= sc.nextInt();
        int r;
        int q;

        for(int i=n;i>=1;i--)
        {
            r=num%Math.powExact(10, i-1);
            q=num/Math.powExact(10,i-1);

            sum=sum+q;
            num=r;
        }

        System.out.println("Sum of all digits is : "+sum);

        sc.close();

    }
    
}
