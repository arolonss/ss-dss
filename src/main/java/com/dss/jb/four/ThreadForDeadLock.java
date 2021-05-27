/**
 * 
 */
package com.dss.jb.four;

/**
 * @author arolonss
 *
 */
public class ThreadForDeadLock extends Thread {
  @Override
  public void run() {
    System.out.println("ThreadForDeadLock");
  }
}
