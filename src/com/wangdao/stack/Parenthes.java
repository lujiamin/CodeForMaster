package stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * ����ƥ�����⣬ʹ�ö�ջ
 */
public class Parenthes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Stack<Integer> st = new Stack<Integer>(); // ջ���'('��λ���±�
		char ans[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(i);
				ans[i] = ' ';
			} else if (s.charAt(i) == ')') {
				// ջ����
				if (!st.isEmpty()) {
					st.pop();
					ans[i] = ' ';
				} else {
					ans[i] = '?';
				}
			} else {
				ans[i] = ' ';
			}
		}
		while (!st.isEmpty()) {
			ans[st.peek()] = '$';
			st.pop();
		}
		// ���ԭ�ַ����Ͳ�ƥ�������λ��
		System.out.println(s);
		System.out.println(String.valueOf(ans));
		scanner.close();
	}
}
