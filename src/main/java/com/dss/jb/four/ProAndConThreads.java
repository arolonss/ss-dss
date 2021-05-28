package com.dss.jb.four;

public class ProAndConThreads {
  /*
   * Assignment 3 Write a program with one thread (the producer) that produces
   * items (in this case, simple ints). Another thread (the consumer) consumes
   * items. For communacation purposes, both threads have access to a bounded
   * buffer which is basically an array.
   */

  public static void main(String[] args) {

    ProducerThread pt1 = new ProducerThread();

    pt1.setName("producer1");
    pt1.start();

    ConsumerThread ct1 = new ConsumerThread(pt1);

    ct1.setName("consumer1");
    ct1.start();
    
    ProducerThread pt2 = new ProducerThread();

    pt2.setName("producer2");
    pt2.start();

    ConsumerThread ct2 = new ConsumerThread(pt1);

    ct2.setName("consumer2");
    ct2.start();
    
    ProducerThread pt3 = new ProducerThread();

    pt3.setName("producer3");
    pt3.start();

    ConsumerThread ct3 = new ConsumerThread(pt1);

    ct3.setName("consumer3");
    ct3.start();
  }

}
