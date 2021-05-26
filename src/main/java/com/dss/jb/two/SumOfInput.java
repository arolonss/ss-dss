package com.dss.jb.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfInput {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Welcome to to Sum Machine!");
    System.out.println();
    System.out.println("Give me three numbers and I'll give you the sum!");

    getUserInput();
  }

  public static void getUserInput() {

    int[] addends = new int[3];

    int counter = 0;
    int i;

    try {
      while (counter < 3) {
        i = sc.nextInt();
        addends[counter] = i;
        counter++;
      }
      sc.close();
      calcSum(addends);

    } catch (InputMismatchException e) {
      System.out.println("All three numbers must be integers! Please try again later.");
      System.exit(0);
    }

  }

  public static void calcSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("The sum is " + sum);

    System.exit(0);
  }
}
