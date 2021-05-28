package com.dss.jb.four;

import java.util.ArrayList;

public class ConsumerThread extends Thread {
  private ProducerThread producer;

  public ConsumerThread(ProducerThread producer) {
    this.producer = producer;
  }

  @Override
  public void run() {
    try {
      while (true) {
        Integer boundedBuffer = producer.take();
        System.out.println(Thread.currentThread().getName() + "took this.");
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

}
