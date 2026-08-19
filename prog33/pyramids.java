package prog33;

public class pyramids 
{
    public void main()
    {
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=n/2-i+2;j>0;j--)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=2*i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
    
}
