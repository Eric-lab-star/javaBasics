
package org.example;
public class Exception3 {
  public static void run() {
    try {
      Exception e = new Exception("고의로 예외를 발생시켰음");
      throw e;
    } catch (Exception e) {
      System.out.println("에러 메시지: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
