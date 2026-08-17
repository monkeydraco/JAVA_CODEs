package prog18;
import java.util.Scanner;

public class vowcon 
{
    public void main()
    {
        int vow;
        int con;
        char word;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character");
        word=sc.next().charAt(0);

        if(word=='a'||word=='e'||word=='i'||word=='o'||word=='u'||word=='A'||word=='E'||word=='I'||word=='O'||word=='U')
        {
            System.out.println("character "+word+" is a vowel");
        }
        else if(word>'A'&&word<'Z'||word>'a'&&word<'z')
        {
            System.out.println("character "+word+" is a consonant");
        }
        else
        {
            System.out.println("Not a Vowel neither a consonant");
        }

        sc.close();


    }
    
}
