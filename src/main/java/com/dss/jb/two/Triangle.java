package com.dss.jb.two;

import java.lang.Math;

public class Triangle implements Shape {

  int sideOne;
  int sideTwo;
  int sideThree;

  public Triangle(int x, int y, int z) {
    sideOne = (int) x;
    sideTwo = (int) y;
    sideThree = (int) z;
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(8, 15, 17);
    triangle.display();
  }

  @Override
  public int calculateArea() {
    // add all sides then divide by 2 to get semi-perimeter
    int sp = (sideOne + sideTwo + sideThree) / 2;
    // get square rt of semi-peri after subtracting sides from semi-peri
    return (int) Math.sqrt(sp * (sp - sideOne) * (sp - sideTwo) * (sp - sideThree));
  }

  @Override
  public void display() {
    System.out.println(String.format("Triangle area: %d", this.calculateArea()));
  }

}
