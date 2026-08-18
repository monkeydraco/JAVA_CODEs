package prog26;
import java.util.Scanner;

public class prime 
{
    public void main()
    {
        int n;
        int flag=1;
        Scanner sc=new Scanner(System.in);

        //input
        n=sc.nextInt();

        for(int i=2;i<n;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                flag=1;
            }
            else
            {
                System.out.println(i+"\t");
            }
        }

        sc.close();
    }
    
}
