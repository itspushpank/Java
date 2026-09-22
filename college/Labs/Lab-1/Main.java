

class Main
{
    public static void main(String [ ] args)
    {
        Circle c1 = new Circle(11);
        c1.area();
        c1.circumfrence();
    }
}

class Circle
{
    double PI = 3.14;
    double radius;
    double area;
    double circumfrence;

    void area()
    {
        area= PI*radius*radius;
        System.out.println("The area of the circle is : "+area);
    }

    void circumfrence()
    {
        circumfrence=PI*radius*2;
        System.out.println("The circumfrence of the circle is : "+circumfrence);
    }

    Circle(double r)
    {
        radius=r;
    }
}