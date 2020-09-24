package baekjoon.stack._4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 균형잡힌 세상
 * https://www.acmicpc.net/problem/4949
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		
		String result;
		String str = br.readLine();
		while (!".".equals(str)) {
			stack.clear();
			String[] strArr = str.split("");
			result = "";

			for (int i = 0; i < strArr.length; i++) {
				String s = strArr[i];
				
				if (")".equals(s) || "]".equals(s)) {
					if (stack.isEmpty()) {
						result = "no";
						break;
					}
					else if(("(".equals(stack.peek()) && ")".equals(s))
							|| ("[".equals(stack.peek()) && "]".equals(s))) {
						stack.pop();
					}
					else {
						result = "no";
					}
				}
				else if ("(".equals(s) || "[".equals(s)){
					stack.push(s);	
				}
				else if(".".equals(s)) {
					break;
				}
			}
			
			if("".equals(result)) {
				sb.append(stack.isEmpty() ? "yes" : "no");
			}
			else {
				sb.append(result);
			}
			
			sb.append("\n");
			
			str = br.readLine();
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
