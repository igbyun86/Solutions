package baekjoon.dynamic._1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 01타일
 * https://www.acmicpc.net/problem/1904
 * @author big
 *
 */
public class Main {
	static int[] arr = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n+1];


		if(n < 2) {
			System.out.println(n);
			return;
		}

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			arr[i] = (arr[i-2] + arr[i-1]) % 15746;
		}

		System.out.println(arr[n]);

		br.close();
	}
}
