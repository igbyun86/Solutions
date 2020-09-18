package baekjoon.recursive._10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
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
	
	private static int solution(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		return solution(n-2) + solution(n-1);
	}
}
