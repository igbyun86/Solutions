package baekjoon.sort._10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[][] strArr = new String[n][3];
		for (int i = 0; i < n; i++) {
			String[] inputArr = br.readLine().split(" ");
			strArr[i][0] = inputArr[0];
			strArr[i][1] = inputArr[1];
			strArr[i][2] = String.valueOf(i);
		}
		
		Arrays.sort(strArr, new Comparator<String[]>() {
			@Override
			public int compare(String[] arr1, String[] arr2) {
				int a = Integer.parseInt(arr1[0]);
				int b = Integer.parseInt(arr2[0]);
				
				if (a == b) {
					return Integer.compare(Integer.parseInt(arr1[2]), Integer.parseInt(arr2[2]));
				}
				
				return Integer.compare(a, b);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(strArr[i][0] + " " + strArr[i][1] + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
