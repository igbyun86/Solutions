package baekjoon.greedy._1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 회의실배정
 * https://www.acmicpc.net/problem/1931
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			String[] strArr = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(strArr[0]);
			arr[i][1] = Integer.parseInt(strArr[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] arr1, int[] arr2) {
				if (arr1[1] == arr2[1]) {
					return Integer.compare(arr1[0], arr2[0]);
				}
				
				return Integer.compare(arr1[1], arr2[1]);
			}
		});
		
		int endTime = arr[0][1];
		int count = 1;
		for (int i = 1; i < N; i++) {
			if (endTime <= arr[i][0]) {
				endTime = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
		br.close();
	}
}
