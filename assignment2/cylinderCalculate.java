import java.util.Scanner;

class Cylinder {  // Class name should be capitalized
    private double radius;
    private double height;

    // Corrected constructor without return type
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
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

        // Create the Cylinder object correctly
        Cylinder c = new Cylinder(radius, height);

        // Display the results
        c.display();

        sc.close();  // It's good practice to close the scanner
    }
}
