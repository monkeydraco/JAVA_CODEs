package prog15;
import java.util.Scanner;

public class factortf 
{
    public void main()
    {
        int number;
        Scanner sc=new Scanner(System.in);

        //input
        System.out.println("Enter the number");
        number=sc.nextInt();

        if(number%3==0&&number%5==0)
        {
            System.out.println(number+" is divisible by both 3 and 5");
        }
        else if(number%3==0&&number%5!=0)
        {
            System.out.println(number+" is not divisible by 5 but divisible by 3");
        }
        else if(number%5==0&&number%3!=0)
        {
            System.out.println(number+" is not divisible by 3 but divisible by 5");
        }
        else
        {
            System.out.println(number+" is not divisible by both 3 and 5");
        }
        sc.close();
    }

    
}
