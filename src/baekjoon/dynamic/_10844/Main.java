package baekjoon.dynamic._10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 쉬운 계단 수
 * https://www.acmicpc.net/problem/10844
 * @author big
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1 - 9 => 9
		
		// 1 - 99
		// 10 12 21 23 32 34 43 45 ... 98 => 16 + 1 
		
		// 1 - 999
		// 101 121 123 212 210 232 234 343 345 323 321 ... 878 876 898 989 987 => 3+4+4+...+3+2 = 32
		
		// 1 - 9999
		// 1010 1012 1210 1212 1232 1234  2101 2121 2123 2321 2323 2343 2345 ... 8765 8767 8787 8789 8987 8989 9898 9876 9878 => 6+7+8+8+...+8+7+6+3 = 61
		
		int n = Integer.parseInt(br.readLine());

		int[][] DP = new int[n+1][10];
		final int num = 1000000000;

		for (int i = 0; i <= 9; i++) {
			DP[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			DP[i][0] = DP[i-1][1] % num;

			for (int j = 1; j <= 8; j++) {
				DP[i][j] = (DP[i-1][j-1] + DP[i-1][j+1]) % num;
			}

			DP[i][9] = DP[i-1][8] % num;
		}

		long result = 0;
		for (int i = 1; i <= 9; i++) {
			result = (result + DP[n][i]) % num;
			System.out.print(DP[n][i] + " ");
		}

		System.out.println(result);
		br.close();
	}
}
