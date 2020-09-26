package com.builder.algo.random;

public class Fibonacci {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			System.out.println(new Fibonacci().fibo(i));
		}
	}

	private int fibo(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

}
