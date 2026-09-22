import java.util.Scanner;

public class Qno16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter registration number: ");
        double regNo = sc.nextDouble();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + regNo);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Address: " + address);

        sc.close();
    }
}
