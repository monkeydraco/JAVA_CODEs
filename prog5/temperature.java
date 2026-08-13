package prog5;
import java.util.Scanner;

public class temperature
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        if(choice==1)
        {
            System.out.println("Enter the Temperature in celsius");
            float cel=sc.nextFloat();
            float fah=((cel*1.8f)+32);
            System.out.println("Farenheit : "+fah);
        }
        else if(choice==2)
        {
            System.out.println("Enter the Temperatue in Farenheit");
            float fah=sc.nextFloat();
            float cel=(fah-32)/1.8f;

            System.out.println("Celsius : "+cel);
        }
        else
        {
            System.out.println("Invalid choice");
        }

        sc.close();

    }
}