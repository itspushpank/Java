import java.util.Scanner;

public class Qno8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area of Circle = " + area);
        System.out.println("Perimeter of Circle = " + perimeter);

        sc.close();
    }
}
