package shapeMaker;

import shapes.*;

public class Main {
    static void main() {
        Circle c1 = new Circle(6);
        Rectangle r1 = new Rectangle(8,9);
        Triangle t1 = new Triangle(5,10);

        c1.area();
        r1.area();
        t1.area();

    }
}
