// Inheritance in Java is a fundamental concept that allows a
// class to
// inherit or
// acquire the
// properties and
// behaviors of another class.
// It enables
// the creation
// of a new class(subclass)
// based on
// an existing class(superclass).
// The subclass
// inherits the
// characteristics of
// the superclass, including

// its fields (variables)

// and methods (functions). This is done to promote code reusability and to establish a hierarchical relationship between classes.

// Imagine you have a blueprint for a basic vehicle, which includes common features like wheels, engine, and the ability to move forward. Now, you want to create more specific types of vehicles, such as a car, a motorcycle, and a bicycle. Instead of creating each new type from scratch, you can use the existing vehicle blueprint as the superclass and define the specialized features of each vehicle in separate subclasses.

// Here's a simple explanation of inheritance using Java syntax:

// Superclass (Base class)
class Vehicle {
      int numWheels;
      String engineType;

      void moveForward() {
            System.out.println("Moving forward...");
      }
}

// Subclass (Derived class)
class Car extends Vehicle {
      boolean hasAC;

      void honkHorn() {
            System.out.println("Honking the horn!");
      }
}

// Subclass (Derived class)
class Motorcycle extends Vehicle {
      boolean hasSideCar;

      void doWheelie() {
            System.out.println("Doing a wheelie!");
      }
}

// Subclass (Derived class)
class Bicycle extends Vehicle {
      int numGears;

      void ringBell() {
            System.out.println("Ring, ring!");
      }
}

// In this example, we have a superclass Vehicle that represents a generic
// vehicle with common properties like numWheels and engineType, and a

// method moveForward(). Then, we have three subclasses Car, Motorcycle, and
// Bicycle. Each subclass extends the Vehicle class, which means they inherit
// the fields and methods of the superclass.

// Car has an additional property hasAC and a method honkHorn().
// Motorcycle has an additional property hasSideCar and a

// method doWheelie().
// Bicycle has an additional property numGears and a

// method ringBell().
// By using inheritance, we avoid duplicating code for common features among
// different types of vehicles. Instead, we define them once in the Vehicle
// class, and all subclasses automatically inherit those features. This makes
// the code more organized, easier to maintain, and encourages a cleaner design
// of the program.