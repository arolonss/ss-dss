package com.dss.jb.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerThread extends Thread {

  private static final int max = 10;
  private final List<Integer> boundedBuffer = new ArrayList<>();

  @Override
  public void run() {
    try {
      while (true) {
        put();
      }
    } catch (Exception e) {

    }

  }

  // not able to access put() at the same time as another thread
  public synchronized void put() {
    while (boundedBuffer.size() == max) {
      wait();
    }
    Random num = new Random(100);
    boundedBuffer.add(num.nextInt());
    System.out.println("Producer added number to buffer");
    notify();
  }

  public synchronized Integer take() throws Exception {
    notify();
    while (boundedBuffer.isEmpty()) {
      wait();
    }
    Integer num = boundedBuffer.get(0);
    boundedBuffer.remove(num);
    System.out.println("Consumer took a num from buffer");
    return num;

  }

}
