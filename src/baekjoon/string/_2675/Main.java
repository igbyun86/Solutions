package baekjoon.string._2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 반복
 * https://www.acmicpc.net/problem/2675
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] inputStrArr = br.readLine().split(" ");
			int r = Integer.parseInt(inputStrArr[0]);
			String[] strArr = inputStrArr[1].split("");
			
			for (int j = 0; j < strArr.length; j++) {
				String s = strArr[j];
				for (int k = 0; k < r; k++) {
					sb.append(s);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
