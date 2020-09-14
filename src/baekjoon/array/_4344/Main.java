package baekjoon.array._4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 평균은 넘겠지
 * https://www.acmicpc.net/problem/4344
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c = Integer.parseInt(br.readLine());
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < c; i++) {
			String[] strArr = br.readLine().split(" ");
			int n = Integer.parseInt(strArr[0]);
			count = 0;
			sum = 0;
			
			for (int j = 1; j <= n; j++) {
				sum += Integer.parseInt(strArr[j]);	
			}
			avg = sum / (n * 1.0);
			
			for (int j = 1; j <= n; j++) {
				if (avg < Integer.parseInt(strArr[j])) {
					count++;
				}
			}
			
			double result = count / (n * 1.0) * 100;
			result = Math.round(result * 1000) / 1000.0;
			sb.append(String.format("%.3f%%", result));
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
