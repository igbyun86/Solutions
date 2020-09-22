package baekjoon.dynamic._1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * RGB거리
 * https://www.acmicpc.net/problem/1149
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		
		for (int i = 0; i < n; i++) {
			String[] strArr = br.readLine().split(" ");
			int red = Integer.parseInt(strArr[0]);
			int green = Integer.parseInt(strArr[1]);
			int blue = Integer.parseInt(strArr[2]);
			
			if (i == 0) {
				arr[i][0] = red;
				arr[i][1] = green;
				arr[i][2] = blue;
			}
			else {
				arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + red;
				arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + green;
				arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + blue;
			}
		}
		
		System.out.println(Math.min(Math.min(arr[n-1][0], arr[n-1][1]), arr[n-1][2]));
		
		br.close();
	}
}
