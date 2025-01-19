//Here’s a simple Java program demonstrating the use of anonymous inner classes, both with a superclass and an interface:

// Demonstration of Anonymous Inner Classes using Superclass and Interface
public class AnonymousInnerClass {

    // Superclass
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound.");
        }
    }

    // Interface
    interface Vehicle {
        void move();
    }

    public static void main(String[] args) {
        // Anonymous inner class using superclass
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks: Woof Woof!");
            }
        };
        dog.sound();

        // Anonymous inner class using interface
        Vehicle car = new Vehicle() {
            @Override
            public void move() {
                System.out.println("Car moves on four wheels.");
            }
        };
        car.move();
    }
}
