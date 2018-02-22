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

	// �ж�һ�����ǲ�������
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

	// ���ĳ����Χ�ڵ�����1~n,(n<10000)
	public static void outputPrime(int n) {
		boolean[] mark = new boolean[10001];
		int i, j;
		// true ����������
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

	// ��n���������ӵĳ˻�
	public static void divide(int n) {
		// ��mark����������
		boolean[] mark = new boolean[10001];
		int[] primes = new int[10001];
		int primeN = 0;
		int i, j;
		HashMap<Integer, Integer> map = new HashMap<>();

		// true ����������
		for (i = 0; i < 10000; i++) {
			mark[i] = true;
		}
		for (i = 2; i <= 10000; i++) {
			if (mark[i] == false)
				continue;
			primes[primeN++] = i;// �����������ռ任ʱ��
			for (j = i * i; j <= 1000; j += i) {
				mark[j] = false;
			}
		}

		for (i = 0; i < primeN; i++) {
			// primes[i]��n������
			if (n % primes[i] == 0) {
				map.put(primes[i], 0);
				while (n % primes[i] == 0) {
					map.put(primes[i], map.get(primes[i]) + 1);// ��Ӧ�������صĸ�����1
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
