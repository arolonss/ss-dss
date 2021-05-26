package com.dss.jb.one;

public class PatternProgram {

  public static void main(String[] args) {
    printPatternOne();
    printPatternTwo();
    printPatternThree();
    printPatternFour();
  }

  public static void printPatternOne() {

    System.out.println("1)");
    for (int i = 1; i < 5; i++) {
      // i is the amount of stars that will be printed
      printStar(i);
      System.out.println();
    }
    printDot(9);
    System.out.println();
  }

  public static void printPatternTwo() {
    System.out.println("2)");
    printDot(10);
    System.out.println();
    for (int i = 4; i > 0; i--) {
      printStar(i);
      System.out.println();
    }
  }

  public static void printPatternThree() {
    int starArr[] = { 7, 5, 3, 1 };
    System.out.println("3)");
    for (int i = 5; i > 1; i--) {
      printSpace(i);
      printStar(starArr[i - 2]);
      System.out.println();
    }
    printDot(11);
    System.out.println();
  }

  public static void printPatternFour() {
    int starArr[] = { 7, 5, 3, 1 };
    System.out.println("4)");
    printDot(12);
    System.out.println();
    for (int i = 2; i < 6; i++) {
      printSpace(i);
      printStar(starArr[i - 2]);
      System.out.println();
    }
    System.out.println();
  }

  // character printers
  public static void printStar(int stars) {
    for (int i = 0; i < stars; i++) {
      System.out.print("*");
    }
  }

  public static void printDot(int dots) {
    for (int i = 0; i < dots; i++) {
      System.out.print(".");
    }
  }

  public static void printSpace(int spaces) {
    for (int i = 0; i < spaces; i++) {
      System.out.print(" ");
    }
  }

}