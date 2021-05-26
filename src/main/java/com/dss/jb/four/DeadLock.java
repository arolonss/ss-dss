package com.dss.jb.four;

public class DeadLock {

  /*
   * Assignment 2 Write a program to create a deadlock between two threads.
   */
  public static void main(String[] args) {
    Thread dltOne = new Thread();
    Thread dltTwo = new Thread();
    // Thread deadLockPT = new Thread(proThread);
    // Thread deadLockCT = new Thread(conThread);
    System.out.println(dltOne);
    System.out.println(dltTwo);

  }

  public void createDeadLock(Thread dltOne, Thread dltTwo) {
    try {
      synchronized (dltOne) {
        Thread.sleep(1000);
        synchronized (dltTwo) {
          System.out.println("dltOne got both locks");
          // Thread.sleep(1000);
        }
      }
    } catch (Exception e) {
      System.out.println("Something went wrong. Try again later.");
    }
  }

}
