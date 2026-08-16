package prog16;
import java.util.Scanner;
public class grade 
{
    public void main()
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        marks=sc.nextInt();

        //process
        if(marks>90)
        {
            System.out.println("Grade A");
        }
        else if(marks>80)
        {
            System.out.println("Grade B");
        }
        else if(marks>60)
        {
            System.out.println("Grade C");

        }
        else if(marks >40)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade F");
        }

        sc.close();

    }
    
}
