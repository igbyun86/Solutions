package baekjoon.stack._9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호
 * https://www.acmicpc.net/problem/9012
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int t = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		String result;
		for (int i= 0; i < t; i++) {
			stack.clear();
			String strInput = br.readLine();
			String[] strArr = strInput.split("");
			result = "YES";
			for (int j = 0; j < strArr.length; j++) {
				String str = strArr[j];
				
				if (")".equals(str)) {
					if (stack.isEmpty()) {
						result = "NO";
						break;
					}
					else if("(".equals(stack.peek())) {
						stack.pop();
					}
				}
				else {
					stack.push(str);	
				}
			}
			
			if ("YES".equals(result)) {
				result = (stack.isEmpty() ? "YES" : "NO");
			}
			
			sb.append(result + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
