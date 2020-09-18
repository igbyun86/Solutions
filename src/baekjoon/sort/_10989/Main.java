package baekjoon.sort._10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 3
 * https://www.acmicpc.net/problem/10989
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			int count = arr[i];
			
			while (count > 0) {
				sb.append(i);
				sb.append("\n");
				count--;
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
