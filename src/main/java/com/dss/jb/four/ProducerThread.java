package com.dss.jb.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerThread extends Thread {

  private static final int MAX = 10;
  private final List<Integer> boundedBuffer = new ArrayList<>();

  @Override
  public void run() {
    try {
      while (true) {
        put();
      }
    } catch (Exception e) {
        e.getStackTrace();
    }

  }

  // not able to access put() at the same time as another thread
  public synchronized void put() {
    while (boundedBuffer.size() == MAX) {
      System.out.println("buffer full. WAiting for Consumer");
      try {
        wait();
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
      System.out.println("producer got notified from consumer ");
    }
    Random num = new Random(100);
    boundedBuffer.add(num.nextInt());
    System.out.println("Producer added number to buffer");
    notifyAll();

  }

  public synchronized Integer take() {
    notifyAll();
    while (boundedBuffer.isEmpty()) {
      try {
		wait();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    }
    Integer num = boundedBuffer.get(0);
    boundedBuffer.remove(num);
    System.out.println("Consumer took a num from buffer");
    return num;

  }

}
