package com.dss.jb.four;

import java.util.ArrayList;
import java.util.List;

// import java.util.concurrent.ArrayBlockingQueue;
// import java.util.concurrent.BlockingQueue;

public class ProAndConThreads {
  /*
   * Assignment 3 Write a program with one thread (the producer) that produces
   * items (in this case, simple ints). Another thread (the consumer) consumes
   * items. For communacation purposes, both threads have access to a bounded
   * buffer which is basically an array.
   */

  public static void main(String[] args) {

    ProducerThread pt = new ProducerThread();

    pt.setName("producer1");
    pt.start();

    ConsumerThread ct = new ConsumerThread(pt);

    ct.setName("consumer1");
    ct.start();
  }

}
