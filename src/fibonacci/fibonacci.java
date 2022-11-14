package Fibonacci;

import java.util.HashMap;

public class Fibonacci {

  static HashMap<Long, Long> memoization = new HashMap<Long, Long>();

  public static void main(String[] args) {
    for (int i = 0; i < 93; i++)
      System.out.println(fibonacci(i));
  }

  private static long fibonacci(long n) {
    if (memoization.containsKey(n))
      return memoization.get(n);

    if (n <= 1)
      return n;

    long value = fibonacci(n - 2) + fibonacci(n - 1);
    memoization.put(n, value);

    return value;
  }

}
