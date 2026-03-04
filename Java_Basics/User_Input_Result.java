import java.util.Scanner;
public class User_Input_Result 
{
    public static void main(String[] args) 
    {
        int marks,attendance;
        String name;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        name=sc.nextLine();

        System.out.println("Enter your Marks");
        marks=sc.nextInt();

        System.out.println("Enter your Attendance");
        attendance=sc.nextInt();

        if(marks>=35 && attendance>=75)
        {
            System.out.println("Pass");
        }
        else if(marks>=35 && attendance<75)
        {
            System.out.println("Fail due to low attendance");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
