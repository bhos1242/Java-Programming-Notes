// Method overriding is a powerful concept in object-oriented programming that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. When a subclass overrides a method, it means that it replaces the original implementation in the superclass with its own version.

// Imagine you have a class called "Animal" with a method called "makeSound()." Now, you want to create a more specific class called "Dog," which is a type of "Animal" and makes a different sound than other animals. Instead of creating a new method with a different name in the "Dog" class, you can use method overriding.

// Here's how method overriding works in an easy-to-understand way:

// Method Declaration in Superclass: The superclass defines a method with a specific name and parameters. In our example, the "Animal" class has a method called "makeSound()".

// Subclass Inherits the Method: When a subclass, such as "Dog," extends the superclass, it automatically inherits the "makeSound()" method from the "Animal" class.

// Method Overriding in Subclass: In the "Dog" class, you create a new version of the "makeSound()" method with the same name and parameters. This new version will have a different implementation to represent the unique sound of a dog.

// Dynamic Dispatch: When you call the "makeSound()" method on an object of the "Dog" class, Java knows to use the overridden method in the "Dog" class instead of the one in the "Animal" class. This is called dynamic dispatch, where the method to be executed is determined at runtime based on the actual object's type.

// Example:
class Animal {
      void makeSound() {
            System.out.println("Generic animal sound");
      }
}

class Dog extends Animal {
      @Override
      void makeSound() {
            System.out.println("Woof woof!"); // Overrides the makeSound() method in the superclass
      }
}

public class Main {
      public static void main(String[] args) {
            Animal animal = new Animal();
            animal.makeSound(); // Output: "Generic animal sound"

            Animal dog = new Dog(); // Polymorphism - Dog is treated as an Animal
            dog.makeSound(); // Output: "Woof woof!" (Dynamic dispatch calls the Dog's makeSound() method)
      }
}

// Method overriding allows you to create specialized behavior for different
// subclasses while maintaining a consistent interface through the superclass.
// It's a powerful tool that promotes code reusability, flexibility, and
// polymorphism in object-oriented programming.