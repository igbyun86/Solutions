package baekjoon.array._8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OX퀴즈
 * https://www.acmicpc.net/problem/8958
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		//OX
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int totalScore;
		int score;
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String[] strArr = br.readLine().split("");
			totalScore = 0;
			score = 0;
			
			for (int j = 0; j < strArr.length; j++) {
				if ("O".equals(strArr[j])) {
					score++;
				} else {
					score = 0;
				}
				
				totalScore += score;
			}
			
			sb.append(totalScore);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();		
	}
}
