import java.util.Scanner;

class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

public class CalculatorWithConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first integer: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Enter second integer: ");
                int num2 = scanner.nextInt();
                
                Calculator calc = new Calculator(num1, num2);
                
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + calc.add());
                        break;
                    case 2:
                        System.out.println("Result: " + calc.subtract());
                        break;
                    case 3:
                        System.out.println("Result: " + calc.multiply());
                        break;
                    case 4:
                        System.out.println("Result: " + calc.divide());
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}