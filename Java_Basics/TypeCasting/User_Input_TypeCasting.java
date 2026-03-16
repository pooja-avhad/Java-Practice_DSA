import java.util.Scanner;
public class User_Input_TypeCasting 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a;
        System.out.println("Enter the Decimal Number:");
        a=sc.nextDouble();
        int b=(int)a;
        System.out.println(b);
     }
}
