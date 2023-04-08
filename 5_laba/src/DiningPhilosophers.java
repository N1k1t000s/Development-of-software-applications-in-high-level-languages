/**
 * This is my main class, here I will write my code
 * @author <strong>Nikita Derevlev</strong>
 * @version 0.0.7
 * @since 0.0.1
 */

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Here start point of the program.
         * @param args the command line arguments
         */
        // We declare 5 philosophers and 5 forks (represented by semaphores)
        Semaphore[] forks = new Semaphore[5];
        Philosopher[] philosophers = new Philosopher[5];

        // Initializing forks
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1); // Each fork can only be occupied by one philosopher
        }

        // Create and run threads for each philosopher
        for (int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % 5]);
            philosophers[i].start();
        }

        // Waiting for all threads to complete their work
        for (int i = 0; i < 5; i++) {
            philosophers[i].join();
        }
    }
}

/**
 * The Philosopher class is an implementation of the algorithm for solving the problem of five philosophers.
 * Philosophers dine at a round table and must share five forks among themselves.
 * Each philosopher can hold only one fork in his hands.
 * To eat the spaghetti in front of him, he needs two forks - left and right.
 * If a philosopher takes only one fork, then he will not be able to eat spaghetti.
 * If the philosopher takes both forks, is carried away by contemplative reflections, does not notice
 * that someone he needs a fork and will not free it, leaving the rest of the philosophers without the opportunity to eat.
 */

class Philosopher extends Thread {

    /** Philosopher ID. */

    private int id;

    /** Left fork semaphore. */

    private Semaphore leftFork;

    /** Right fork semaphore. */

    private Semaphore rightFork;

    /**
     * Philosopher class constructor.
     *
     * @param id - Philosopher's ID.
     * @param leftFork - Left fork semaphore.
     * @param rightFork - Right fork semaphore.
     */


    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    /**
     * The run() method executes an infinite loop in which the philosopher
     * thinks about life and goes into a state of waiting for his turn for food.
     * When the philosopher is ready to eat, he tries to take the left fork, blocking it,
     * if she is occupied by another philosopher.
     * Then the philosopher tries to take the right fork, blocking it in the event that
     * if she is occupied by another philosopher. If the forks are free, the philosopher proceeds
     * to food and with the help of the sleep() method simulates the process of eating.
     * After finishing the meal, the philosopher releases the forks.
     *
     * To handle the InterruptedException that may occur when using
     * the sleep() method, the exception is handled in the run() method using the printStackTrace() method.
     */
    @Override

    public void run() {
        try {
            while (true) {
                // Philosopher meditates
                System.out.println("Philosopher " + id + " is thinking...");
                sleep((int) (Math.random() * 1000));

                // The philosopher wants to take the left fork
                System.out.println("Philosopher " + id + " wants left fork");
                leftFork.acquire(); // We block the left fork if it is occupied by another philosopher

                // The philosopher wants to take the right fork
                System.out.println("Philosopher " + id + " wants right fork");
                rightFork.acquire(); // We block the right fork if it is occupied by another philosopher

                // Philosopher eating spaghetti
                System.out.println("Philosopher " + id + " is eating...");
                sleep((int) (Math.random() * 1000));

                // Philosopher frees the forks
                rightFork.release();
                leftFork.release();
                System.out.println("Philosopher " + id + " released forks");
            }
        } catch (InterruptedException e) {
            // Exception Handling
            e.printStackTrace();
        }
    }
}