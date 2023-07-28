// Constructors in inheritance in Java play an essential role in creating objects of classes, especially when there is a superclass and subclass relationship. When you create an object of a subclass, Java automatically calls the constructors of both the subclass and the superclass to initialize the object properly.

// Let's consider the previous example of the Vehicle superclass and its subclasses (Car, Motorcycle, and Bicycle). In this case, the constructors will be automatically called in a specific order when you create an object of any subclass.

// Here's how constructors work in inheritance:

// Superclass Constructor: When you create an object of a subclass, Java first calls the constructor of the superclass. This is important because the superclass might have some initialization tasks that need to be done before the subclass can function correctly.

// Subclass Constructor: After the superclass constructor is called, Java proceeds to the subclass constructor to initialize the subclass-specific properties. The subclass constructor can also access and use the members (fields and methods) inherited from the superclass.

// Let's illustrate this with code:

class Vehicle {
      int numWheels;
      String engineType;

      // Constructor for the Vehicle class
      Vehicle(int numWheels, String engineType) {
            this.numWheels = numWheels;
            this.engineType = engineType;
            System.out.println("Vehicle constructor called.");
      }

      void moveForward() {
            System.out.println("Moving forward...");
      }
}

class Car extends Vehicle {
      boolean hasAC;

      // Constructor for the Car class
      Car(int numWheels, String engineType, boolean hasAC) {
            // Call the superclass constructor using 'super'
            super(numWheels, engineType);
            this.hasAC = hasAC;
            System.out.println("Car constructor called.");
      }

      void honkHorn() {
            System.out.println("Honking the horn!");
      }
}

// Creating an object of the Car class
public class Main {
      public static void main(String[] args) {
            Car myCar = new Car(4, "Petrol", true);
      }}

      // Output:
      // Vehicle constructor called.
      // Car constructor called.

      // Constructors in inheritance in Java play an essential role in creating
      // objects of classes, especially when there is a superclass and subclass
      // relationship. When you create an object of a subclass, Java automatically
      // calls the constructors of both the subclass and the superclass to initialize
      // the object properly.

      // Let's consider the previous example of the Vehicle superclass and its
      // subclasses (Car, Motorcycle, and Bicycle). In this case, the constructors
      // will be automatically called in a specific order when you create an object of
      // any subclass.

      Here's

      how constructors
      work in inheritance:

Superclass Constructor:
      When you
      create an
      object of
      a subclass, Java
      first calls
      the constructor
      of the
      superclass.This is
      important because
      the superclass
      might have
      some initialization
      tasks that
      need to
      be done
      before the
      subclass can
      function correctly.

Subclass Constructor:
      After the
      superclass constructor
      is called, Java
      proceeds to
      the subclass
      constructor to
      initialize the subclass-specific properties.
      The subclass
      constructor can
      also access
      and use

      the members (fields and methods) inherited from the superclass.

Let's illustrate this with code:

java
Copy code
class Vehicle {
    int numWheels;
    String engineType;

    // Constructor for the Vehicle class
    Vehicle(int numWheels, String engineType) {
        this.numWheels = numWheels;
        this.engineType = engineType;
        System.out.println("Vehicle constructor called.");
    }

    void moveForward() {
        System.out.println("Moving forward...");
    }
}

class Car extends Vehicle {
    boolean hasAC;

    // Constructor for the Car class
    Car(int numWheels, String engineType, boolean hasAC) {
        // Call the superclass constructor using 'super'
        super(numWheels, engineType);
        this.hasAC = hasAC;
        System.out.println("Car constructor called.");
    }

    void honkHorn() {
        System.out.println("Honking the horn!");
    }
}

// Creating an object of the Car class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, "Petrol", true);
    }
}
Output:

kotlin
Copy code
Vehicle constructor called.
Car constructor called.
In the above code, when you create an object of the Car class (Car myCar = new Car(4, "Petrol", true);), Java first calls the constructor of the superclass Vehicle using super(numWheels, engineType);. This ensures that the numWheels and engineType properties of the Car object are properly initialized through the Vehicle constructor. After that, the Car constructor executes to set the hasAC property specific to the Car class.

In summary, constructors in inheritance allow you to properly initialize the objects of both the subclass and superclass, making sure that all necessary properties are set up correctly before using the objects.