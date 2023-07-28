// this Keyword:
// The this keyword refers to the current instance of the class.
// It is mainly used to distinguish between the instance variables (class members) and method parameters that have the same name.
// When a method parameter has the same name as an instance variable, using this allows you to explicitly refer to the instance variable.

// Example:
class Person {
      String name; // instance variable

      // Constructor with parameter 'name'
      Person(String name) {
            this.name = name; // 'this.name' refers to the instance variable, and 'name' refers to the
                              // parameter
      }

      // Method to display the name
      void displayName() {
            System.out.println("My name is " + this.name); // 'this.name' is used to access the instance variable
      }
}

// super Keyword:
// The super keyword is used to access and call the members (fields and methods)
// of the superclass from a subclass.
// It is often used in constructors when you want to call the constructor of the
// superclass to perform superclass-specific initialization before initializing
// the subclass.
// Using super allows you to reuse the code from the superclass in the subclass.
// Example:

class Animal {
      String species;

      // Constructor with parameter 'species'
      Animal(String species) {
            this.species = species;
      }

      void makeSound() {
            System.out.println("Generic animal sound");
      }
}

class Dog extends Animal {
      String breed;

      // Constructor with parameters 'breed' and 'species'
      Dog(String breed, String species) {
            super(species); // Call the constructor of the superclass using 'super'
            this.breed = breed;
      }

      // Method to override the makeSound() method in the superclass
      void makeSound() {
            System.out.println("Woof woof!"); // Overrides the makeSound() method in the superclass
      }
}

// In the example above, the Dog class extends the Animal class. The Dog
// constructor uses super(species); to call the constructor of the superclass
// (Animal) and pass the species parameter to it. This ensures that the species
// property of the Animal class is properly initialized before initializing the
// Dog class.

// In summary, this is used to refer to the current instance (object) of the
// class, while super is used to access and call members of the superclass from
// a subclass. Both keywords are essential for clarity, reusability, and proper
// initialization in Java code.