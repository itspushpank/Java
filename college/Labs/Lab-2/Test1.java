public class Test1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5,5,10);
        Box b3 = new Box(20);

        b1.volume();
        b2.volume();
        b3.volume();

        b2.length = 20;
        b2.volume();
        
    }

}

class Box {
    double length;
    double bredth;
    double height;
    double volume;

    void volume() {
        volume = length * bredth * height;
        System.out.println("The volume of the Box is : "+ volume);
    }

    Box() {
        length = 0.0;
        bredth = 0.0;
        height = 0.0;
    }

    Box(double l, double b, double h) {
        length = l;
        bredth = b;
        height = h;
    }

    Box(double l) {
        length = l;
        bredth = l;
        height = l;
    }

}
