// Imagine you're at a party, and different guests are playing different games. Each guest might have a preference for how much attention they want to give to their game. Some guests might really want to win and focus entirely on the game, while others might want to have fun but not take it too seriously.

// In Java, thread priorities work in a similar way. Threads can have different priorities that indicate how much CPU time they should receive from the operating system. Threads with higher priorities are more likely to get more CPU time, allowing them to execute their tasks more frequently. However, it's important to note that thread priorities are not strict rules and might vary based on the system's scheduling.

// Here are the main thread priority levels in Java:

// MIN_PRIORITY: Lowest priority level (1). Threads with this priority are considered least important and receive less CPU time compared to other threads.

// NORM_PRIORITY: Default priority level (5). Most threads have this priority. It's considered a normal level of importance.

// MAX_PRIORITY: Highest priority level (10). Threads with this priority are considered most important and receive more CPU time compared to other threads.

// Here's a simplified example to help you understand:

class MyThread extends Thread {
      public void run() {
            for (int i = 0; i < 5; i++) {
                  System.out.println(
                              "Thread " + threadId() + " with priority " + getPriority() + " is performing action "
                                          + i);
            }
      }

}

public class Thread_Priorities74 {

      public static void main(String[] args) {
            MyThread lowPriorityThread = new MyThread();
            MyThread highPriorityThread = new MyThread();

            lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
            highPriorityThread.setPriority(Thread.MAX_PRIORITY);

            lowPriorityThread.start();
            highPriorityThread.start();
      }

}
// In this example:

// We create two threads: lowPriorityThread and highPriorityThread.
// We set the priority of lowPriorityThread to the minimum and
// highPriorityThread to the maximum.
// Both threads perform actions, but the thread with higher priority
// (highPriorityThread) might get more CPU time, allowing it to execute its
// actions more frequently.
// Keep in mind that while thread priorities can influence scheduling, they
// don't guarantee a specific order or amount of CPU time. The actual behavior
// might vary depending on the operating system and the JVM implementation.

// Just like at a party, where guests might get more attention based on their
// preferences, thread priorities in Java affect how much attention threads get
// from the CPU, but it's not a strict rule.