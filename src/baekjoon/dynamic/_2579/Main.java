package baekjoon.dynamic._2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] pointArr = new int[n];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			pointArr[i] = Integer.parseInt(br.readLine());
		}
		
		if (n == 1) {
			System.out.println(pointArr[0]);
			return;
		}
		else if (n == 2) {
			System.out.println(pointArr[0] + pointArr[1]);
			return;
		}
		else if (n == 3) {
			System.out.println(Math.max((pointArr[0] + pointArr[2]), (pointArr[1] + pointArr[2])));
			return;
		}
		
		arr[0] = pointArr[0];
		arr[1] = pointArr[0] + pointArr[1];
		arr[2] = Math.max((pointArr[0] + pointArr[2]), (pointArr[1] + pointArr[2]));
		for (int i = 3; i < n; i++) {
			arr[i] = Math.max((arr[i-3] + pointArr[i-1]), arr[i-2]) + pointArr[i];
		}
		
		System.out.println(arr[n-1]);
		
		br.close();
	}
}
