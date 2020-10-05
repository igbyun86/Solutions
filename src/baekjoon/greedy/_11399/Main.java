package baekjoon.greedy._11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ATM
 * https://www.acmicpc.net/problem/11399
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		String[] strArr = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);
		
		int time = arr[0];
		int tempTime = arr[0];
		for (int i = 1; i < N; i++) {
			tempTime += arr[i];
			time += tempTime;
		}
		
		System.out.println(time);
	
		br.close();
	}
}
