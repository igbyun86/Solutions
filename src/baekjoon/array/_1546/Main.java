package baekjoon.array._1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 평균
 * https://www.acmicpc.net/problem/1546
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		double maxValue = Integer.MIN_VALUE;
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(strArr[i]);
			arr[i] = num;
			maxValue = Math.max(maxValue, num);
		}
		
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += (arr[i] / maxValue) * 100.0;
		}
		
		System.out.println(sum / (N * 1.0));
		
		br.close();
	}
}
