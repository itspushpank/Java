import java.util.Scanner;

class Calculator {
    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
        
        return result;
    }
}

public class CalculatorClassObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        Calculator calc = new Calculator();
        double result = calc.calculate(num1, num2, operator);
        
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            if (!(operator == '/' && num2 == 0)) {
                System.out.println("Result: " + result);
            }
        }
        
        scanner.close();
    }
}