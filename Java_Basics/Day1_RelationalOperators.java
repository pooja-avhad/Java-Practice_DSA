import java. util.Scanner;
public class Day1_RelationalOperators
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        number=sc.nextInt();

        if(number>0)
        {
            System.out.println("Positive");
        }
        else if(number==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
