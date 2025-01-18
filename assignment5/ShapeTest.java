interface Shape{
    double pi = 3.14;

    double calculateArea();
}
class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return pi * radius * radius;
    }
}
class Rectangle implements Shape{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length * width;
    }
}

public class ShapeTest{
    public static void main(String[] args){
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.calculateArea());

        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}