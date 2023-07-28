// Dynamic method dispatch is an important concept in object-oriented
// programming, particularly in Java. It allows a program to determine the
// appropriate method to call at runtime based on the actual type of the object,
// rather than its reference type. This is also known as runtime polymorphism or
// late binding.

// Imagine you have a superclass called "Animal" with a method called
// "makeSound()." You also have two subclasses: "Dog" and "Cat," each of which
// overrides the "makeSound()" method with its own implementation.

// Here's how dynamic method dispatch works in an easy-to-understand way:

// Method Overriding: The subclasses ("Dog" and "Cat") override the
// "makeSound()" method from the superclass ("Animal") with their own unique
// implementations. This means each subclass has its own version of the method.

// Reference and Object Types: When you create an object of a subclass and store
// it in a reference variable of the superclass, the reference type determines
// which methods are accessible from that variable.

// Dynamic Dispatch: At runtime, Java determines the actual type of the object
// that the reference variable is pointing to. Then, it dynamically chooses the
// appropriate method implementation based on that actual type. This allows the
// program to call the correct method even if the reference variable's type is a
// superclass.

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

class Cat extends Animal {
      @Override
      void makeSound() {
            System.out.println("Meow meow!"); // Overrides the makeSound() method in the superclass
      }
}

public class Main {
      public static void main(String[] args) {
            Animal animal1 = new Dog();
            Animal animal2 = new Cat();

            animal1.makeSound(); // Output: "Woof woof!" (Dynamic dispatch calls the Dog's makeSound() method)
            animal2.makeSound(); // Output: "Meow meow!" (Dynamic dispatch calls the Cat's makeSound() method)
      }
}

// In the example above, the reference variables animal1 and animal2 are of type
// Animal, but they point to objects of subclasses Dog and Cat, respectively.
// When we call the makeSound() method on these reference variables, Java
// dynamically dispatches the method call to the appropriate subclass's
// implementation based on the actual type of the objects.

// Dynamic method dispatch allows for flexible and polymorphic behavior in
// object-oriented programming, where the method to be executed is determined at
// runtime based on the specific object's type, enabling code to be more
// adaptable and extensible.