package prog35;
import java.util.Scanner;

public class gcd_lcm 
{
    public void main()
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int big=n1;
        if(n2>n1)
        {
            big=n2;
        }
        int hcf=1;
        int temp1=n1;
        int temp2=n2;

        while(n1!=1||n2!=1)
        {
            for(int i=2;i<=big;i++)
            {
                if(n1%i==0&&n2%i==0)
                {
                    
                    n1=n1/i;
                    n2=n2/i;
                    hcf=hcf*i;
                    break;
                }
                else if(n1%i==0)
                {
                    n1=n1/i;

                }
                else if(n2%i==0)
                {
                    n2=n2/i;
                }
                
            }
        }

        int lcm=(temp1*temp2)/hcf;

        System.out.println("HCF IS "+hcf);

        System.out.println("LCM IS "+ lcm);

        sc.close();


    }
    
}
