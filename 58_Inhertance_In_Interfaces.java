// Inheritance in interfaces is a powerful concept in Java that allows a class to acquire the properties and method declarations from one or more interfaces. It's like adopting a set of rules or behaviors defined by the interfaces. Interfaces provide a way to achieve multiple inheritances since a class can implement multiple interfaces.

// Imagine you have multiple classes that perform different types of movement, such as walking and swimming. Instead of creating separate classes for each movement type, you can define interfaces to represent these behaviors.

// Here's how inheritance in interfaces works in an easy-to-understand way:

// Interface Definition: First, you define the interfaces with method declarations, but no method implementations. For example, you could have an "Walking" interface with a method declaration void walk(), and a "Swimming" interface with a method declaration void swim().

// Class Implementation: Next, you create classes that implement the interfaces. When a class implements an interface, it promises to provide the implementations for all the methods declared in that interface.

// Multiple Inheritance: Since a class can implement multiple interfaces, it can inherit and exhibit behaviors from all the interfaces it implements. This is a form of multiple inheritance, where a class can gain characteristics from multiple sources.

// Example:

// Interface representing walking behavior
interface Walking {
      void walk();
}

// Interface representing swimming behavior
interface Swimming {
      void swim();
}

// Class that implements both Walking and Swimming interfaces
class Human implements Walking, Swimming {
      @Override
      public void walk() {
            System.out.println("Human is walking");
      }

      @Override
      public void swim() {
            System.out.println("Human is swimming");
      }
}

public class Main {
      public static void main(String[] args) {
            Human person = new Human();
            person.walk(); // Output: "Human is walking"
            person.swim(); // Output: "Human is swimming"
      }
}

// In the example above, we have two interfaces, "Walking" and "Swimming,"
// representing specific behaviors. The class "Human" implements both of these
// interfaces, so it gains the ability to walk and swim.

// Inheritance in interfaces allows you to create flexible and modular code,
// promoting code reusability and ensuring that classes adhere to specific
// behaviors defined by the interfaces they implement. It's a powerful tool in
// Java to create clean and organized class hierarchies with multiple
// capabilities.
