package shapes;

public class Triangle implements Shape {

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public void area(){
        System.out.println("Area of Triangle : " + (0.5 * base * height));
    }
}
