package hash;

import java.util.Scanner;

/*
 * ���� N ��ѧ���ĳɼ��������ĳһ����������ѧ���������
 */
public class NumOfSameGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ���ڶ����������
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int score[] = new int[101];
			for (int i = 0; i < n; i++) {
				score[scanner.nextInt()]++;
			}
			int target = scanner.nextInt();
			System.out.println(score[target]);
		}
		scanner.close();
	}

}
