package shapes;

public class Rectangle implements Shape {
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area(){
        System.out.println("Area of rectangle : " + (length * width));
    }

}
