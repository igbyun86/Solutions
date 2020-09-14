package baekjoon.string._5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 다이얼
 * https://www.acmicpc.net/problem/5622
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split("");
		
		int time = 0;
		for (int i = 0; i < strArr.length; i++) {
			String s = strArr[i];
			
			if ("ABC".contains(s)) {
				time += 3;
			} else if ("DEF".contains(s)) {
				time += 4;
			} else if ("GHI".contains(s)) {
				time += 5;
			} else if ("JKL".contains(s)) {
				time += 6;
			} else if ("MNO".contains(s)) {
				time += 7;
			} else if ("PQRS".contains(s)) {
				time += 8;
			} else if ("TUV".contains(s)) {
				time += 9;
			} else if ("WXYZ".contains(s)) {
				time += 10;
			}
		}
		
		System.out.println(time);
		
		br.close();
	}
}
