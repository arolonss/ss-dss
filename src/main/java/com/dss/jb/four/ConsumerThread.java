package com.dss.jb.four;

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
        System.out.println(Thread.currentThread().getName() + "took this " + boundedBuffer + ".");
        Thread.sleep(200);
      }
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

}
