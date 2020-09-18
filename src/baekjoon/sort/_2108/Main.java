package baekjoon.sort._2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 통계학
 * https://www.acmicpc.net/problem/2108
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;

		int[] tempArr = new int[8001];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			tempArr[arr[i] + 4000]++;
		}
		
		StringBuilder sb = new StringBuilder();
		if (n == 1) {
			sb.append(String.valueOf(arr[0]) + "\n");
			sb.append(String.valueOf(arr[0]) + "\n");
			sb.append(String.valueOf(arr[0]) + "\n");
			sb.append(0);
			System.out.println(sb.toString());
			return;
		}

		Arrays.sort(arr);

		// 산술평균
		int a = (int) Math.round(sum / (n * 1.0));
		sb.append(String.valueOf(a) + "\n");

		// 중앙값
		int b = arr[n/2];
		sb.append(String.valueOf(b) + "\n");
		
		// 최빈값
		List<Integer> list = new ArrayList<>();
		int maxIndex = 0;
		int maxCount = 0;
		boolean isDupl = false;
		for (int i = 0; i < tempArr.length; i++) {
			int num = tempArr[i];
			if (maxCount < num && num > 0) {
				maxCount = num;
				maxIndex = i;
				isDupl = false;
				list.clear();
				list.add(i - 4000);
			}
			else if (num == maxCount && num > 0) {
				isDupl = true;
				list.add(i - 4000);
			}
		}
		
		int c;
		if (isDupl) {
			c = list.get(1);
		} else {
			c = maxIndex - 4000;
		}
		sb.append(String.valueOf(c) + "\n");
		
		// 범위
		int d = arr[n-1] - arr[0];
		sb.append(String.valueOf(d) + "\n");
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
