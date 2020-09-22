package baekjoon.dynamic._2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 2
 * https://www.acmicpc.net/problem/2748
 * @author big
 *
 */
public class Main {
	static long[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new long[n];
		
		System.out.println(solution(n));
		
		br.close();
	}
	
	public static long solution(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		if (arr[n-2] == 0) {
			arr[n-2] = solution(n-2);
		}
		
		if (arr[n-1] == 0) {
			arr[n-1] = solution(n-1);
		}
		
		return arr[n-2] + arr[n-1]; 
	}
}
