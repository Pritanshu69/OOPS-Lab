import java.util.Scanner;

class Cylinder {  
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void display() {
        System.out.println("Area of cylinder: " + calculateArea());  // Add parentheses to call methods
        System.out.println("Circumference of cylinder: " + calculateCircumference());  // Add parentheses to call methods
    }
}
public class cylinderCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");   
        double height = sc.nextDouble();
        Cylinder c = new Cylinder(radius, height);
        c.display();

        sc.close(); 
    }
}
