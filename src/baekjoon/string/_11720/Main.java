package baekjoon.string._11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 * https://www.acmicpc.net/problem/11720
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split("");
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
