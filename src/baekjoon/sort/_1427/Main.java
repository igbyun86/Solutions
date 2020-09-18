package baekjoon.sort._1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 소트인사이드
 * https://www.acmicpc.net/problem/1427
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split("");
		Arrays.sort(strArr);
		
		StringBuilder sb = new StringBuilder();
		for (int i = strArr.length-1; i >= 0; i--) {
			sb.append(strArr[i]);
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
