package baekjoon.dynamic._1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1로 만들기
 * https://www.acmicpc.net/problem/1463
 * @author big
 *
 */
public class Main {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		System.out.println(solution(n));
		
		br.close();
	}
	
	private static int solution(int n) {
		if (n == 1) {
			return 0;
		}
		
		if (arr[n] > 0) {
			return arr[n];
		}
		
		arr[n] = solution(n - 1) + 1;
		
		if (n % 3 == 0) {
			int num = solution(n / 3) + 1;
			if (arr[n] > num) {
				arr[n] = num;
			}
		}
		
		if (n % 2 == 0) {
			int num = solution(n / 2) + 1;
			if (arr[n] > num) {
				arr[n] = num;
			}
		}
		
		return arr[n];
	}
}
