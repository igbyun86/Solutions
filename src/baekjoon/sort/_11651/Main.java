package baekjoon.sort._11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 좌표 정렬하기 2
 * https://www.acmicpc.net/problem/11651
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
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				if (a[1] == b[1]) {
					return Integer.compare(a[0], b[0]);
				}
				
				return Integer.compare(a[1], b[1]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(String.valueOf(arr[i][0]) + " " + String.valueOf(arr[i][1]) + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
