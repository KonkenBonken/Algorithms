package Fibonacci;

import java.util.HashMap;

public class Fibonacci {

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++)
      System.out.println(fibonacci(i));

  }

  private static int fibonacci(int n) {
    if (n <= 1)
      return n;
    return fibonacci(n - 2) + fibonacci(n - 1);
  }

}
