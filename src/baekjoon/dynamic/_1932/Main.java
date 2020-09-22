package baekjoon.dynamic._1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 정수 삼각형
 * https://www.acmicpc.net/problem/1932
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		
		arr[0][0] = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < n; i++) {
			String[] strArr = br.readLine().split(" ");
			int arrLen = strArr.length;
			for (int j = 0; j < arrLen; j++) {
				int num = Integer.parseInt(strArr[j]);
				if (j == 0) {
					arr[i][0] = arr[i-1][0] + num;	
				}
				else if (j == arrLen - 1) {
					arr[i][j] = arr[i-1][j - 1] + num;
				}
				else {
					arr[i][j] = Math.max(arr[i-1][j - 1], arr[i-1][j]) + num;
				}
			}
		}
		
		Arrays.sort(arr[n-1]);
		System.out.println(arr[n-1][n-1]);
		
		br.close();
	}
}
