package com.dss.jb.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

public class CountTheChar {
  /*
   * Assignment 3 Write a Java program that counts the number of times a
   * particular character, such as 'e', appears in a file. The character can be
   * specified at the command line. take in user input
   * 
   */
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Welcome to Count the Char!");
    System.out.println();
    /*
     * File class represents a single file or directory. File construtor accepts a
     * directory path as parameter and creates object that represents specified
     * directory .exists() comes from File class to confirm if the specified
     * directory path exists or not.
     */
    // ask user if they want to slect a file or use default file
    File fileToRead = getUserFile().exists() ? getUserFile() : useDefaultFile();
    char charToCount = getUserChar();

    countCharInFile(fileToRead, charToCount);

  }

  private static File getUserFile() {
    System.out.println(
        "Which file would you like me to examine? If it doesn't exist, I will just use my default file(sample.txt).");
    String userInput = sc.next();
    File userFile = new File(userInput);
    return userFile;
  }

  private static File useDefaultFile() {
    File defaultFile = new File("src/day1/com/ss/jb/three/sample.txt");
    System.out.println();
    System.out.println("!!!Using default file!!!");
    System.out.println();
    return defaultFile;
  }

  private static char getUserChar() {
    System.out.println("Which character would you like me to count for you?");
    String userInput = sc.next();
    // converts to one char
    char userChar = userInput.charAt(0);
    sc.close();
    return userChar;
  }

  private static void countCharInFile(File f, char c) {

    int charCount = 0, line;

    System.out.println();
    try {
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);

      while ((line = br.read()) != -1) {

        if (line == c) {
          charCount++;
        }
        System.out.println(line);
        System.out.println(charCount);
        break;
      }
      br.close();
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (java.io.IOException e) {
      e.printStackTrace();
    }

    System.out.println("I found " + c + " " + charCount + " times in this file.");
  }
}
