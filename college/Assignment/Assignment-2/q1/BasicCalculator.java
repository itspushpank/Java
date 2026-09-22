import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        Calculator calc = new Calculator(num1, num2);
        
        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        switch (choice) {
            case 1:
                result = calc.add();
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calc.subtract();
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calc.multiply();
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calc.divide();
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}