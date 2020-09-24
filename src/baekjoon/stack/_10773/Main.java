package baekjoon.stack._10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로
 * https://www.acmicpc.net/problem/10773
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int k = Integer.parseInt(br.readLine());
		int result = 0;
		
		Stack<Integer> stack = new Stack<>(); 
		for (int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				int lastNum = stack.pop();
				result -= lastNum;
				continue;
			}
			
			stack.push(num);
			result += num;
		}

		System.out.println(result);
		
		br.close();
	}
}
