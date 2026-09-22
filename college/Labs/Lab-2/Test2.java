import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Box b1 = new Box();

        System.out.println("Enter the length :");
        b1.length=sc.nextDouble();
        System.out.println("Enter the bredth :");
        b1.bredth=sc.nextDouble();
        System.out.println("Enter the height :");
        b1.height=sc.nextDouble();

        double volume = b1.length*b1.bredth*b1.height;
        System.out.println("The volume of the box is :" + volume);
        sc.close();
    }

}

class Box {
    double length;
    double bredth;
    double height;


}