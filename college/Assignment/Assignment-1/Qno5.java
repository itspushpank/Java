import java.util.Scanner;

public class Qno5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = num1 * num2;

        System.out.println("Multiplication = " + result);

        sc.close();
    }
}
