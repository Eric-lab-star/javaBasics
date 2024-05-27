package org.example;

import java.io.File;

public class App {
  public static void main(String[] args) {
    File f = null;
    try {
      f = Exception5.createFile("happyHacking");
      System.out.println(f.getName() + " was successfully created");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
