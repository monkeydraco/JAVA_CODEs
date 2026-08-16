package prog14;
import java.util.Scanner;

public class leap 
{
    public void main()
    {
    int year;
    Scanner sc=new Scanner(System.in);

    //input
    year = sc.nextInt();

    //process
    if(year%4==0&&year%100!=0||year%400==0) 
    {
        System.out.println("Year is leap year");
    }
    else
    {
        System.out.println("Year is not leap year");
    }
    sc.close();
    }

    
}
