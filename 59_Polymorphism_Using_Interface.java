// Imagine you have different classes representing different shapes like circles, squares, and triangles. Each shape has its unique way of calculating its area. Now, you want to create a method that can calculate the area of any shape without knowing the specific details of each shape's calculations.

// Here's how polymorphism using interfaces works in an easy-to-understand way:

// Shape Interface: First, you create an interface called "Shape" that declares a method called calculateArea(). It's like a contract that says, "Any shape that wants to be part of this club must know how to calculate its area."

// Shape Implementations: Next, you create classes for each shape (e.g., Circle, Square), and each class implements the "Shape" interface. By implementing the interface, each shape agrees to provide its own version of the calculateArea() method.

// Polymorphic Usage: Now, you can use polymorphism. You treat objects of different shape classes as if they are just "Shapes." This means you can call the calculateArea() method on any shape object without worrying about the specific shape type. Java figures out the right method to call based on the actual shape of the object.

// Example:

// Shape Interface
interface Shape {
      double calculateArea();
}

// Circle Class
class Circle implements Shape {
      private double radius;

      public Circle(double radius) {
            this.radius = radius;
      }

      @Override
      public double calculateArea() {
            return Math.PI * radius * radius;
      }
}

// Square Class
class Square implements Shape {
      private double side;

      public Square(double side) {
            this.side = side;
      }

      @Override
      public double calculateArea() {
            return side * side;
      }
}

public class Main {
      public static void main(String[] args) {
            Shape circle = new Circle(5.0);
            Shape square = new Square(4.0);

            // Polymorphic Usage
            System.out.println("Area of Circle: " + circle.calculateArea()); // Output: Area of Circle: 78.54
            System.out.println("Area of Square: " + square.calculateArea()); // Output: Area of Square: 16.0
      }
}

// In this example, we have a "Shape" interface that declares the
// calculateArea() method. Both the "Circle" and "Square" classes implement this
// interface with their own way of calculating area. When we create objects of
// these classes and treat them as "Shapes," we can call the calculateArea()
// method without knowing their specific types. Java takes care of calling the
// right method for each shape, making our code flexible and easy to maintain.

// Polymorphism using interfaces helps us write more generic and versatile code,
// where we can treat objects of different classes uniformly based on their
// shared behavior, promoting code reuse and making our programs more adaptable.
