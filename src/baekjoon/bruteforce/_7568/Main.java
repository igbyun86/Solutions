package baekjoon.bruteforce._7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 덩치
 * https://www.acmicpc.net/problem/7568
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			String[] strArr = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(strArr[0]);
			arr[i][1] = Integer.parseInt(strArr[1]);
		}

		StringBuilder sb = new StringBuilder();
		int count;
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			
			sb.append(count);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
