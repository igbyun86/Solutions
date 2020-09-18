package baekjoon.recursive._10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
		
		br.close();
	}
	
	public static int solution(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * solution(n-1);
	}
}
