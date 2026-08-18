package prog29;
import java.util.Scanner;

public class reverse 
{
    public void main()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number ");
        num=sc.nextInt();

        int r;
        int q;
        int rev=0;
        while(num!=0)
        {
            r=num%10;
            q=num/10;

            num=q;
            rev=rev*10+r;
            
            
        }

        System.out.println("Reverse of. anumber is : "+rev);
        
        sc.close();


    }
    
}
