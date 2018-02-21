package hash;

import java.util.Scanner;

/*
 * 读入 N 名学生的成绩，将获得某一给定分数的学生人数输出
 */
public class NumOfSameGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 存在多组测试数据
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
