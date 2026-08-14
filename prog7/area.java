package prog7;
import java.util.Scanner;

public class area
{
    public void main()
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        l=sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle");
        b=sc.nextInt();
        
        int area=l*b;
        System.out.println("Area of Rectangle : "+area);

        System.out.println("Enter the Radius of a Circle");
        int r=sc.nextInt();

        float areac;

        areac=3.14f*r*r;
        
        System.out.println("Area of circle is : "+ areac);

        sc.close();

    }

}