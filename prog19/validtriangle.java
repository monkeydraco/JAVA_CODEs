package prog19;
import java.util.Scanner;

public class validtriangle 
{
    public void main()
    {
        Float a1,a2,a3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three angles");
        a1=sc.nextFloat();
        a2=sc.nextFloat();
        a3=sc.nextFloat();

        //process
        if(a1+a2+a3==180)
        {
            System.out.println("Angles provide valid Triangle ");
        }
        else
        {
            System.out.println("Angles provide a non valid Traingle");
        }

        sc.close();
    }
    
}
