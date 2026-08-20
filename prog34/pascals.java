package prog34;
import java.util.Scanner;

public class pascals 
{
    public void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int[][] arr=new int[n][n];

        arr[0][0]=1;
        arr[1][0]=1;
        arr[1][1]=1;

        for(int i=0;i<n;i++)
        {
            for(int k=n/2-i+5;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                }
                else
                {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.printf("\n");
        }

        sc.close();

        //System.out.println(Arrays.deepToString(arr));
            

        
    }
    
}
