package shapes;

public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area(){
        System.out.println("Area of Circle : " + 3.14 * radius);
    }

}
