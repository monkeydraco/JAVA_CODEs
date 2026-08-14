package prog8;
import java.util.Scanner;

public class scprint
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str;
        str=sc.next();

        System.out.println("ThE value taken form the keyboard is : "+str);
        sc.close();
    }
}