package primeNumbers;

import java.lang.Math;

public class primeNumbers {

	public static void main(String[] args) {
		int i = 1;

		while (i < 10000) {
			if (isPrime(i))
				System.out.println(i);

			i++;
		}
	}

	private static boolean isPrime(int n) {
		for (int j = 2; j < Math.sqrt(n) + 1; j++)
			if (n % j == 0)
				return false;

		return true;
	}
}
