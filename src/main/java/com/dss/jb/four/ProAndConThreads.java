package com.dss.jb.four;


public class ProAndConThreads {
  /*
   * Assignment 3 Write a program with one thread (the producer) that produces
   * items (in this case, simple ints). Another thread (the consumer) consumes
   * items. For communacation purposes, both threads have access to a bounded
   * buffer which is basically an array.
   */
  int[] numArr = {};

  public static void main(String[] args) {
    Runnable proThread = new ProducerThread();
    Runnable conThread = new ConsumerThread();
    Thread pt = new Thread(proThread);
    Thread ct = new Thread(conThread);
    pt.start();
    ct.start();
  }

}
