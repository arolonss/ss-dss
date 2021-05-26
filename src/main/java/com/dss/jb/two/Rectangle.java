package com.dss.jb.two;

public class Rectangle implements Shape {
  int height;
  int width;

  public Rectangle(int h, int w) {
    height = (int) h;
    width = (int) w;
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 10);
    rectangle.display();
  }

  @Override
  public int calculateArea() {
    return this.height * this.width;
  }

  @Override
  public void display() {
    System.out.println(String.format("Rectangle area: %d", this.calculateArea()));
  }

}
