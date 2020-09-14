package baekjoon.string._1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 단어 공부
 * https://www.acmicpc.net/problem/1157
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		
		String inputStr = br.readLine().toUpperCase();
		char[] chArr = inputStr.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			arr[((int) chArr[i]) - 65]++;
		}
		
		String result = "";
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxCount < arr[i]) {
				maxCount = arr[i];
				result = String.valueOf((char) (i + 65));
			}
			else if (maxCount == arr[i]) {
				result = "?";
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
