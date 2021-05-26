package com.dss.jb.two;

import java.lang.Math;

public class Circle implements Shape {

  int radius;

  public Circle(int rad) {
    radius = (int) rad;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(4);
    circle.display();
  }

  @Override
  public int calculateArea() {
    return (int) (Math.PI * Math.pow(this.radius, 2));
  }

  @Override
  public void display() {
    System.out.println(String.format("Circle area: %d", this.calculateArea()));
  }

}
