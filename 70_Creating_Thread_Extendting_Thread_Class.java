Creating a thread in Java by extending the Thread
class is
like creating a new
character in
a play.

Each character (thread) can follow its own script (code) and perform actions simultaneously with other characters. Let's break it down step by step:

Create a Class Extending Thread: Imagine you're writing a new character for a play. This character will be a thread. You create a new Java class that extends the Thread class. This class represents your thread and holds the actions it will perform.

Override the run() Method: In your character's script, there's a special section where you define what the character does. Similarly, in your Java class, you override the run() method. This is where you write the code that the thread will execute.

Instantiate and Start the Thread: Once you've defined your character (thread), you create an instance of it and call the start() method. This is like telling your character to enter the stage and start following their script.

Here's a simplified example to help you grasp the concept:

java
Copy code
// Step 1: Create a class extending the Thread class
class MyThread extends Thread {
    // Step 2: Override the run() method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Character " + getName() + " is performing action " + i);
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Step 3: Instantiate and start the thread
        MyThread character1 = new MyThread();  // Create a new character (thread)
        MyThread character2 = new MyThread();  // Create another character (thread)

        character1.start();  // Start the first character (thread)
        character2.start();  // Start the second character (thread)
    }
}
In this example:

We create a class MyThread that extends the Thread class.
Inside MyThread, we override the run() method, which contains the actions our character (thread) will perform.
In the main method of the ThreadCreationExample class, we create two instances of MyThread (character1 and character2) and start them using the start() method.
When you run this program, the two characters (threads) perform their actions concurrently, and you'll see their output mixed together.

Remember, just like in a play, the order of execution between threads may vary each time you run the program, creating an interesting and dynamic performance!

That's how you create and start a thread in Java by extending the Thread class. It's a straightforward way to introduce parallelism and achieve multitasking in your programs.