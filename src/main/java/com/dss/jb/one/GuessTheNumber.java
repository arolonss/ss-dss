package com.dss.jb.one;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
  static Scanner sc = new Scanner(System.in);
  static Random rand = new Random();
  static int secretNum = rand.nextInt(100) + 1;
  static int guessLimit = 5;

  public static void main(String[] args) {
    greetUser();
  }

  public static void greetUser() {
    // greets user and starts game by calling gameLoop method
    System.out.println("Welcome to Guess the Number!");
    gameLoop();
  }

  public static void gameLoop() {
    // User is asked to guess a number 1-100. (Program chooses randomly.)
    while (guessLimit > 0) {
      System.out.println("Pick a number from 1 - 100");
      int userGuess = sc.nextInt();
      checkGuess(userGuess);
      System.out.println("Try again.");
      guessLimit--;
    }
    String gameOver = String.format("Sorry, the correct answer is %d", secretNum);
    System.out.println(gameOver);
    System.exit(0);
  }

  public static void checkGuess(int userGuess) {

    int tenLess = secretNum - 10;
    int tenMore = secretNum + 10;
    /*
     * If the guess is within 10 of the correct answer, plus or minus, output the
     * correct answer and exit.
     */

    if (userGuess >= tenLess && userGuess <= tenMore) {
      String closeGuessMsg = String.format("The correct answer is %d", secretNum);
      System.out.println(closeGuessMsg);
      System.exit(0);
      /*
       * If the number is not within 10 of the correct answer, ask the user to keep
       * guessing.
       */
    } else if (userGuess <= tenLess && userGuess >= tenMore) {
      gameLoop();
    }

  }
}
