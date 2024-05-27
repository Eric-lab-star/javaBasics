package org.example;

import java.io.File;

public class Exception5 {
  public static File createFile(String filename) throws Exception {
    if (filename == null || filename.equals(""))
      throw new IllegalArgumentException("invalid file name" + filename);
    File f = new File(filename);
    f.createNewFile();
    return f;
  }
}
