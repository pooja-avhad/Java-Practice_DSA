class Calculator {

    // Method for addition
    int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(10, 5);
        int result2 = calc.subtract(10, 5);
        int result3 = calc.multiply(10, 5);
        int result4 = calc.divide(10, 5);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
    }
}