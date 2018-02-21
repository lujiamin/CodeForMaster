package stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * 括号匹配问题，使用堆栈
 */
public class Parenthes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Stack<Integer> st = new Stack<Integer>(); // 栈存放'('的位置下标
		char ans[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(i);
				ans[i] = ' ';
			} else if (s.charAt(i) == ')') {
				// 栈不空
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
		// 输出原字符串和不匹配的括号位置
		System.out.println(s);
		System.out.println(String.valueOf(ans));
		scanner.close();
	}
}
