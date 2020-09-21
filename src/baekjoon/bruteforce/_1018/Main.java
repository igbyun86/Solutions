package baekjoon.bruteforce._1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 체스판 다시 칠하기
 * https://www.acmicpc.net/problem/1018
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] sArr = br.readLine().split(" ");
		int M = Integer.parseInt(sArr[0]);
		int N = Integer.parseInt(sArr[1]);
		String[][] arr = new String[M][N];
		
		for (int i = 0; i < M; i++) {
			String[] inputStr = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				arr[i][j] = inputStr[j];
			}
		}
		
		int minCount = Integer.MAX_VALUE;
		int count = 0;
		boolean isWhite = true;
		for (int i = 0; i < (M - 7); i++) {
			for (int j = 0; j < (N - 7); j++) {
				
				// 첫번째 칸이 white인 경우와 black인 경우 각각 계산 
				for (int t = 0; t < 2; t++) {
					isWhite = (t == 0 ? true : false);
					count = 0;
					
					for (int k = i; k < (i + 8); k++) {
						for (int l = j; l < (j + 8); l++) {
							if (isWhite) {
								if ((l % 2 == 0 && "B".equals(arr[k][l])) 
										|| (l % 2 == 1 && "W".equals(arr[k][l]))) {
									count++;
								} 
							}
							else {
								if ((l % 2 == 0 && "W".equals(arr[k][l])) 
										|| (l % 2 == 1 && "B".equals(arr[k][l]))) {
									count++;
								}
							}
						}
						isWhite = (isWhite ? false : true);  
					}
					minCount = Math.min(minCount, count);
				}
			}
		}
		
		System.out.println(minCount);
		
		br.close();
	}
}
