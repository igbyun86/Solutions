package baekjoon.dynamic._9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 파도반 수열
 * https://www.acmicpc.net/problem/9461
 * @author big
 *
 */
public class Main {
	static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n < 4) {
				sb.append("1\n");
				continue;
			}
			
			if (n == 4) {
				sb.append("2\n");
				continue;
			}

			arr = new long[n+1];
			arr[1] = 1;
			arr[2] = 1;
			arr[3] = 1;
			arr[4] = 2;
			
			for (int k = 5; k <= n; k++) {
				arr[k] = arr[k-5] + arr[k-1]; 
			}
			
			sb.append(String.valueOf(arr[n]) + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
