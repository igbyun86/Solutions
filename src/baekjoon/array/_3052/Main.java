package baekjoon.array._3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 나머지
 * https://www.acmicpc.net/problem/3052
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			hs.add(num % 42);
		}
		
		System.out.println(hs.size());
		
		br.close();
	}
}
