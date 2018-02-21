package sort;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 成绩排序
 */
public class Grades {

	public static void main(String[] args) {

		Student arr[] = new Student[3];
		// 一定要申请空间
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
		}
		arr[0].setName("abc");
		arr[0].setAge(20);
		arr[0].setScore(99);

		arr[1].setName("bcd");
		arr[1].setAge(19);
		arr[1].setScore(97);

		arr[2].setName("bed");
		arr[2].setAge(20);
		arr[2].setScore(97);

		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student a, Student b) {
				// 返回负数，代表a<b.返回整数，代表a>b
				if (a.score != b.score) {
					return a.score - b.score;
				} else if (a.name.compareTo(b.name) != 0) {
					return a.name.compareTo(b.name) < 0 ? -1 : 1;
				} else {
					return a.age - b.age;
				}
			}
		});

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
