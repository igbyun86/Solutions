package baekjoon.bruteforce._2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 블랙잭
 * https://www.acmicpc.net/problem/2798
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
				
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		
		int[] arr = new int[n];
		String[] inputArr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputArr[i]);
		}
		
		int result = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k]; 
					if (sum == m) {
						System.out.println(m);
						return;
					}
					
					if (sum < m) {
						result = Math.max(result, sum);
					}
				}
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
