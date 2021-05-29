package com.dss.jb.four;

public class DoubleCheckedLocking {
  /*
   * Assignment 1 Implement a Singleton with double checked locking.
   */

  // make sure to put volatile if public
  private static volatile DoubleCheckedLocking instance = null;

  private DoubleCheckedLocking() {

  }

  // this must be public static in order to be accessed from outside of the class
  public static DoubleCheckedLocking getInstance() {
    // by putting synchronized here, it is not blocking the entire method. Only the
    // block

    // like wise, we could block the entire class. but we have a private constructr
    // so we dont need it
    if (instance == null) {
      synchronized (DoubleCheckedLocking.class) {
        if (instance == null) {
          instance = new DoubleCheckedLocking();
        }
      }
    }
    return instance;
  }

}
