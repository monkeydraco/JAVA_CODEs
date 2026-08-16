package prog12;
import java.util.Scanner;

public class largethree 
{
    public void main()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three numbers");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        //process
        if(a>b&&a>c)
        {
            System.out.println(a+" is the largest");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b+" is the largest");
        }
        else if(c>a&&c>b)
        {
            System.out.println(c+" is the largest");
        }
        else if(a==b&&a>c)
        {
            System.out.println(a+" and "+b+" are equal and largest");
        }
        else if(a==c&&a>b)
        {
            System.out.println(a+" and "+c+" are equal and the largest");
        }
        else if(c==b&&b>a)
        {
            System.out.println(c+" and "+b+" are eqal and the largest");
        }
        else
        {
            System.out.println(a+""+""+b+"c"+" are all equal");
        }

        sc.close();



    }
    
}
