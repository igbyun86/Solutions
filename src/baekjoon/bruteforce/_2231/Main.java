package baekjoon.bruteforce._2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분해합
 * https://www.acmicpc.net/problem/2231
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		for (int i = n; i > 0; i--) {
			String[] strNumArr = String.valueOf(i).split("");
			int sum = i;
			for (int j = 0; j < strNumArr.length; j++) {
				sum += Integer.parseInt(strNumArr[j]);
			}
			
			if (n == sum) {
				result = i;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
