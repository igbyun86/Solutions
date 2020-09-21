package baekjoon.bruteforce._1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 영화감독 숌
 * https://www.acmicpc.net/problem/1436
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		int count = 0;
		int num = 666;
		while (n > count) {
			
			if (String.valueOf(num).indexOf("666") > -1) {
				count++;
				result = num;
			}
			num++;
		}
		
		System.out.println(result);
		
		br.close();
	}
}
