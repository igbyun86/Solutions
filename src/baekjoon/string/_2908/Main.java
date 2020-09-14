package baekjoon.string._2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 상수
 * https://www.acmicpc.net/problem/2908
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] strArr = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		String strA = sb.append(strArr[0]).reverse().toString();
		sb.setLength(0);
		String strB = sb.append(strArr[1]).reverse().toString();
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		
		System.out.println(Math.max(a, b));
		
		br.close();
	}
}
