package baekjoon.array._2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 개수
 * https://www.acmicpc.net/problem/2577
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int result = 1;
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(br.readLine());
			result *= num;
		}
		
		String strNum = String.valueOf(result);
		String[] strArr = strNum.split("");
		for (int i = 0; i < strArr.length; i++) {
			arr[Integer.parseInt(strArr[i])]++;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		br.close();
	}
}
