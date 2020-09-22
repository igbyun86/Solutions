package baekjoon.dynamic._1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 * @author big
 *
 */
public class Main {
	static long[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr = new long[num+1];
			
			if(num == 0) {
				sb.append("1 0");
			}
			else {
				sb.append(String.format("%d %d", solution(num-1), solution(num)));
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
		
		
		br.close();
	}
	
	public static long solution(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		if (arr[n] == 0) {
			arr[n] = solution(n-2) + solution(n-1); 
		}
		
		return arr[n]; 
	}
}
