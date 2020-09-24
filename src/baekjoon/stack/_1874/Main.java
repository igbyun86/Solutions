package baekjoon.stack._1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 수열
 * https://www.acmicpc.net/problem/1874
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		int inputNum = 0;
		int index = 1;
		for (int k = 0; k < n; k++) {
			inputNum = Integer.parseInt(br.readLine());
			
			while(true) {
				if(stack.isEmpty()) {
					stack.add(index);
					index++;
					sb.append("+\n");
				}
				else {
					if(stack.peek() < inputNum && index <= n) {
						stack.add(index);
						index++;
						sb.append("+\n");
					}
					else if(stack.peek() > inputNum) {
						System.out.println("NO");
						return;
					}

					if(stack.peek() == inputNum) {
						stack.pop();
						sb.append("-\n");
						break;
					}
				}
			}
		}

		System.out.println(sb.toString());
		
		br.close();
	}
}
