package prog20;
import java.util.Scanner;

public class quadcheck 
{
    public void main()
    {
        float x,y;  
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the co-ordinates");
        x=sc.nextFloat();
        y=sc.nextFloat();

        //process
        if(x>0&&y>0)
        {
            System.out.println(x+" and "+y+" belongs to First Quadrant");
        }
        else if(x<0&&y>0)
        {
            System.out.println(x+" and "+y+" belongs to Second Quadrant");
        }
        else if(x<0&&y<0)
        {
            System.out.println(x+" and "+y+" belongs to Thrid Quadrant");
        }
        else if(x>0&&y<0)
        {
            System.out.println(x+" and "+y+" belongs to Fourth Quadrant");
        }
        else if(x==0&&y==0)
        {
            System.out.println(x+" and "+" are the origin");
        }
        else
        {
            System.out.println("Invalid Input");
        }

        sc.close();

    }
    
}
