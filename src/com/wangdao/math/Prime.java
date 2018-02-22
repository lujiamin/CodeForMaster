package com.wangdao.math;

import java.util.HashMap;

public class Prime {

	public static void main(String[] args) {
		int n = 1000;
		outputPrime(n);
		System.out.println();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		divide(420);
	}

	// 判断一个数是不是素数
	public static boolean isPrime(int n) {
		if (n == 1) {
			return true;
		}
		int k = (int) Math.sqrt(n);
		for (int i = 2; i <= k; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 输出某个范围内的素数1~n,(n<10000)
	public static void outputPrime(int n) {
		boolean[] mark = new boolean[10001];
		int i, j;
		// true 代表是素数
		for (i = 0; i < 10000; i++) {
			mark[i] = true;
		}
		for (i = 2; i <= 10000; i++) {
			if (mark[i] == false)
				continue;
			for (j = i * i; j <= 1000; j += i) {
				mark[j] = false;
			}
		}
		for (i = 2; i <= n; i++) {
			if (mark[i]) {
				System.out.print(i + " ");
			}
		}
	}

	// 将n拆解成素因子的乘积
	public static void divide(int n) {
		// 用mark数组标记素数
		boolean[] mark = new boolean[10001];
		int[] primes = new int[10001];
		int primeN = 0;
		int i, j;
		HashMap<Integer, Integer> map = new HashMap<>();

		// true 代表是素数
		for (i = 0; i < 10000; i++) {
			mark[i] = true;
		}
		for (i = 2; i <= 10000; i++) {
			if (mark[i] == false)
				continue;
			primes[primeN++] = i;// 存入质数，空间换时间
			for (j = i * i; j <= 1000; j += i) {
				mark[j] = false;
			}
		}

		for (i = 0; i < primeN; i++) {
			// primes[i]是n的因子
			if (n % primes[i] == 0) {
				map.put(primes[i], 0);
				while (n % primes[i] == 0) {
					map.put(primes[i], map.get(primes[i]) + 1);// 对应的质因素的个数加1
					n /= primes[i];
				}
				if (n == 1) {
					break;
				}
			}
		}
		System.out.println(map);
	}

}
