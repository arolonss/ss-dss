package com.dss.jb.three;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class AppendTextToFile {
  /*
   * Assignment 2 Write a Java program to append text to an existing file.
   * 
   * @author arolonss
   *
   */
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Let's append text to a file!");

    File fileToAppendTo = getUserFile(); // .exists() ? getUserFile() : useDefaultFile();
    String textToAppend = getUserText();

    appendTextToFile(fileToAppendTo, textToAppend);
  }

  private static File getUserFile() {
    System.out.println("Which file would you like to append to?");
    String userInput = sc.nextLine();
    File userFile = new File(userInput);
    return userFile;
  }

  private static String getUserText() {
    System.out.println("What do you want to write to the chosen file?");
    String userText = sc.nextLine();
    System.out.println(userText);

    return userText;
  }

  private static void appendTextToFile(File f, String t) {

    try (FileWriter fw = new FileWriter(f)) {

      fw.write(t);
      fw.close();
    } catch (IOException e) {

      e.printStackTrace();
    }
    System.exit(0);
  }

}
