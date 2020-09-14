package baekjoon.array._10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최소, 최대
 * https://www.acmicpc.net/problem/10818
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(strArr[i]);
			minValue = Math.min(num, minValue);
			maxValue = Math.max(num, maxValue);
		}
		
		System.out.println(minValue + " " + maxValue);
		
		br.close();
	}
}
