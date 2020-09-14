package baekjoon.string._11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 아스키 코드
 * https://www.acmicpc.net/problem/11654
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		char ch = inputStr.charAt(0);
		
		System.out.println((int) ch);
		
		br.close();
	}
}
