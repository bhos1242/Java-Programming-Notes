
// Abstract Class:

// Abstract class is like a blueprint for other classes, providing a common structure with some parts left unfinished.
// It starts with the keyword "abstract" before the class name.
// It can have both regular methods (with code inside them) and abstract methods (without code) that need to be completed by specific classes.
// Abstract classes can have instance variables and constructors just like regular classes.
// A class can extend only one abstract class (single inheritance).
// Interface:

// Interface is a contract that classes agree to follow, providing a list of methods without code (like rules) that must be implemented by those classes.
// It starts with the keyword "interface" before the interface name.
// It only contains abstract methods (without code) and constant values (variables with fixed values).
// Interfaces cannot have instance variables or constructors.
// A class can implement multiple interfaces (multiple inheritance-like behavior).
// Example:

// Imagine building a game with different characters, and you want to create a base structure for characters with some common actions and abilities.

// Abstract Class:

// java
// Copy code
abstract class Character {
    int health;

    // Constructor
    public Character(int health) {
        this.health = health;
    }

    // Abstract method (needs to be completed by specific characters)
    public abstract void attack();

    // Regular method (with code inside)
    public void move() {
        System.out.println("Character is moving.");
    }
}Interface:

interface MagicUser {
    int MANA = 100; // Constant value for mana

    void castSpell(); // Abstract method for casting spells
    }

    Classes Implementing
    the Abstract
    Class and Interface:

    class Warrior extends Character {
        // Warrior constructor
        public Warrior(int health) {
            super(health);
        }

        // Implementing the attack method from the Character abstract class
        public void attack() {
            System.out.println("Warrior is using a sword to attack.");
        }
    }

class Wizard extends Character implements MagicUser {
    // Wizard constructor
    public Wizard(int health) {
        super(health);
    }

    // Implementing the attack method from the Character abstract class
    public void attack() {
        System.out.println("Wizard is using a staff to attack.");
    }

    // Implementing the castSpell method from the MagicUser interface
    public void castSpell() {
        System.out.println("Wizard is casting a powerful spell.");
    }
}
// In this example, the abstract class Character serves as a base structure for
// different characters in the game. It has an abstract method attack() that
// each specific character (e.g., Warrior, Wizard) must complete in their own
// way. It also has a regular method move() with its own code.

// The interface MagicUser represents the ability to cast spells. The Wizard
// class implements this interface and provides its implementation for the
// castSpell() method. The Warrior class does not implement the MagicUser
// interface because it doesn't have the ability to cast spells.

// Using abstract classes and interfaces, we can create a flexible and organized
// structure for characters in our game, with shared functionalities and unique
// abilities for each character type.