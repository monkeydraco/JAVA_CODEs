package prog3;
import java.util.Scanner;

public class swap
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;

        System.out.println("Enter value of A");
        a=sc.nextInt();

        System.out.println("Enter value of B");
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A="+a);
        System.out.println("B="+b);

    }
}