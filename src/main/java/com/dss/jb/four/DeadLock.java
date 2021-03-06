package com.dss.jb.four;

/**
 * @author arolonss
 *
 */
public class DeadLock {

  /*
   * Assignment 2 Write a program to create a deadlock between two threads.
   */
  public static void main(String[] args) {

    Object lockA = new Object();
    Object lockB = new Object();
    // Runnable myRunnable = new RunnableThreadInterface();

    System.out.println("Deadlocks are coming!");

    Runnable myRunnable = () -> {
      try {
        synchronized (lockA) {
          System.out.println("myRunnable is going sleep");
          Thread.sleep(2000);
          synchronized (lockB) {
            System.out.println("myRunnable not locked");
          }
        }
      } catch (Exception e) {
        System.out.println("Something went wrong in t3. Try again later.");
      }
    };

    Runnable myRunnable2 = () -> {
      try {
        synchronized (lockB) {
          System.out.println("myRunnable2 is going to sleep");
          Thread.sleep(2000);
          synchronized (lockA) {
            System.out.println("myRunnable2 not locked");
          }
        }
      } catch (Exception e) {
        System.out.println("Something went wrong in t4. Try again later.");
      }
    };
    new Thread(myRunnable).start();
    new Thread(myRunnable2).start();

    System.out.println("End of Deadlock program");
  }
}
