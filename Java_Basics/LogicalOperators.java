public class LogicalOperators
 {
     public static void main(String[] args) 
    {

        int marks = 40;
        int attendance = 80;
        boolean sportsQuota = false;

        // AND Operator Example
        if(marks >= 35 && attendance >= 75){
            System.out.println("Pass using AND condition");
        } else {
            System.out.println("Fail using AND condition");
        }

        // OR Operator Example
        if(marks >= 35 || sportsQuota){
            System.out.println("Pass using OR condition");
        } else {
            System.out.println("Fail using OR condition");
        }

        // NOT Operator Example
        if(!(marks < 35)){
            System.out.println("Marks are not less than 35");
        } else {
            System.out.println("Marks are less than 35");
        }
    }
}
