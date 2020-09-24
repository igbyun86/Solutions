package baekjoon.stack._10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택
 * https://www.acmicpc.net/problem/10828
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String inputStr = "";
		for (int i = 0; i < n; i++) {
			inputStr = br.readLine();
			if (inputStr.indexOf("push") > -1) {
				String[] strArr = inputStr.split(" ");
				stack.push(Integer.parseInt(strArr[1]));
				continue;
			}
			
			switch (inputStr) {
				case "pop" :
					sb.append(String.valueOf(stack.empty() ? "-1" : stack.pop()) + "\n");
					break;
				case "size" :
					sb.append(String.valueOf(stack.size()) + "\n");
					break;
				case "empty" :
					sb.append((stack.empty() ? "1" : "0") + "\n");
					break;
				case "top" :
					sb.append(String.valueOf(stack.empty() ? "-1" : stack.peek()) + "\n");
					break;
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
