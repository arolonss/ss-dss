package com.dss.jb.three;

import java.io.File;
import java.util.Scanner;

public class FileAndDirList {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    /*
     * Assignment 1 Write a Java program to get a list of all file/directory names
     * (including in subdirectories) under a given directory.
     */
    System.out.println("Let's explore a directory");

    getUserDir();
  }

  private static void getUserDir() {
    System.out.println("Which directory would you like to explore?");
    try {
      String userInput = sc.nextLine();
      File userDir = new File(userInput);

      showDir(userDir);
    } catch (NullPointerException e) {
      System.out.println("Not a directory! Please try again.");
      getUserDir();
    } finally {
      sc.close();
    }
  }

  private static void showDir(File userDir) {

    File[] dirs = userDir.listFiles();

    for (File f : dirs) {
      if (f.isDirectory()) {
        System.out.println(f.getName());
        showDir(f);
      } else if (f.isFile()) {
        System.out.println("--" + f.getName());
        // System.out.println(f.getPath());
      }
    }

    System.exit(0);
  }
}
