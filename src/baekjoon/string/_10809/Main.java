package baekjoon.string._10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 찾기
 * https://www.acmicpc.net/problem/10809
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		StringBuilder sb = new StringBuilder();
		String inputStr = br.readLine();
		
		for (int i = 0; i < alphabet.length; i++) {
			String s = alphabet[i];
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(inputStr.indexOf(s));
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
