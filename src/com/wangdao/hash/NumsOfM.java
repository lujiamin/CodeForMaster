package hash;

import java.util.Scanner;

/*
 * 给你 n 个整数，请按从大到小的顺序输出其中前 m 大的数。
 * 典型的空间换时间
 */
public class NumsOfM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			int offset = 500000;
			int arr[] = new int[1000001];
			for (int i = -500000; i <= 500000; i++) {
				arr[offset + i] = 0;
			}
			// 输入n个数
			for (int i = 0; i < n; i++) {
				arr[offset + scanner.nextInt()]++;
			}
			// 输出最大的m个数
			for (int i = 50000; i >= -500000; i--) {
				if (m == 1 && arr[i + offset] > 0) {
					System.out.println(i);
					break;
				}
				if (arr[i + offset] > 0) {
					System.out.print(i + " ");
					m--;
				}
			}
		}
		scanner.close();
	}
}
