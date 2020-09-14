package baekjoon.array._2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최댓값
 * https://www.acmicpc.net/problem/2562
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxValue = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			if (maxValue < num) {
				index = i;
				maxValue = num;
			}
		}
		
		System.out.println(maxValue);
		System.out.println(index + 1);
		
		br.close();
	}
}
