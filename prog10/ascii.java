package prog10;
import java.util.Scanner;

public class ascii 
{
    //programm to find the ascii of a number and vice versa;
    public void main()
    {
        char ch;
        int asciiValue;
        Scanner sc=new Scanner(System.in);

        ch=sc.next().charAt(0);

        asciiValue=(int) ch;
        System.out.println("Ascii Value of "+ch+" is : "+asciiValue);
        sc.close();
        
    }
    
}
