package org.example;

import java.io.File;

public class Exception5 {
  public static void run(String name) {
    File f = createFile(name);
    System.out.println(f.getName());
  }

  private static File createFile(String filename) {
    File f = null;
    try {
      if (filename == null || filename.equals("")) {
        throw new Exception("invalid file name");
      }
    } catch (Exception e) {
      filename = "noname.txt";
    } finally {
      f = new File(filename);
      createNewFile(f);
    }
    return f;
  }

  private static void createNewFile(File f) {
    try {
      f.createNewFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
