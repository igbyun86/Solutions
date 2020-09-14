package baekjoon.string._1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 단어의 개수
 * https://www.acmicpc.net/problem/1152
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		
		// hidden case
		if ("".equals(inputStr) || " ".equals(inputStr)) {
			System.out.println(0);
			return;
		}
		
		if (" ".equals(inputStr.substring(0, 1))) {
			inputStr = inputStr.substring(1, inputStr.length());
		}
		
		System.out.println(inputStr.split(" ").length);
		
		br.close();
	}
}
