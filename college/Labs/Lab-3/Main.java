public class Main {
    static void main() {

        Triangle t1 = new Triangle(10,15);
        Ractangle r1 = new Ractangle(20,30);
        Square s1 = new Square(25);
        Circle c1 = new Circle(21);
        t1.area();
        r1.area();
        s1.area();
        c1.area();

        Triangle t2 =new Triangle();
        Ractangle r2 = new Ractangle();
        Square s2 = new Square();
        Circle c2 = new Circle();

        t2.area();
        r2.area();
        s2.area();
        c2.area();
    }
}


class Shape{

    int length;
    int bredth;

    int height;

    Shape( int length){

        this.length = length;

    }

    Shape(){
        length = 10;
        bredth = 10;

        height =10;
    }

}

class Triangle extends Shape{
//    int height;

    Triangle(int base , int height){
    super(base);
    super.height = height;
    }

    Triangle(){
        super();
    }


    void area(){
        System.out.println("area of triangle is "+ (0.5*length*height));
    }
}

class Ractangle extends Shape{

//    int bredth;
    Ractangle(int length, int bredth){
            super(length);
            super.bredth = bredth;

        }

    Ractangle(){
        super();
    }

    void area(){
        System.out.println("area of rectangle is "+ (length * bredth));
    }
}



class Square extends Shape{

    Square(int side){
        super(side);

    }

    Square(){
        super();
    }
    void area(){
        System.out.println("area of square is "+ (length*length));
    }
}

class Circle extends Shape{

    Circle(int radius){
        super(radius);

    }
    Circle(){
        super();
    }

    void area(){
        System.out.println("area of circle is "+ (3.14*length*length));
    }
}



