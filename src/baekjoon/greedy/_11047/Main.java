package baekjoon.greedy._11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 동전 0
 * https://www.acmicpc.net/problem/11047
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		int N = Integer.parseInt(strArr[0]);
		int K = Integer.parseInt(strArr[1]);
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int index = N - 1;
		int count = 0;
		int amt = K;
		while (index > -1) {
			int money = arr[index];
			if (money <= amt) {
				int mock = amt / money;
				count += mock;
				amt -= (mock * money);
			}
			else {
				index--;
			}
		}
		
		System.out.println(count);
		
		br.close();
	}
}
