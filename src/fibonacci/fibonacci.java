package Fibonacci;

import java.util.HashMap;

public class Fibonacci {

  static HashMap<Integer, Integer> memoization = new HashMap<Integer, Integer>();

  public static void main(String[] args) {
    for (int i = 0; i < 47; i++)
      System.out.println(fibonacci(i));
  }

  private static int fibonacci(int n) {
    if (memoization.containsKey(n))
      return memoization.get(n);

    if (n <= 1)
      return n;

    int value = fibonacci(n - 2) + fibonacci(n - 1);
    memoization.put(n, value);

    return value;
  }

}
