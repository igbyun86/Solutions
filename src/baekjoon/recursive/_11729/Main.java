package baekjoon.recursive._11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하노이 탑 이동 순서
 * https://www.acmicpc.net/problem/11729
 * @author big
 *
 */
public class Main {
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n, 1, 2, 3);
		System.out.println((int)Math.pow(2, n) - 1);
		System.out.println(sb.toString());

		br.close();
	}
	
	private static void solution(int n, int from, int by, int to) {
		if(n == 1) {
			move(from, to);
		}
		else {
			solution(n-1, from, to, by);
			move(from, to);
			solution(n-1, by, from, to);
		}
    }

	 private static void move(int from, int to) {
		 sb.append(String.valueOf(from));
		 sb.append(" ");
		 sb.append(String.valueOf(to));
		 sb.append("\n");
	 }
}
