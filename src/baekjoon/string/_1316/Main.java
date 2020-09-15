package baekjoon.string._1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr;
		int groupCount = 0;
		boolean isGroup = true;
		
		for (int i = 0; i < n; i++) {
			char[] chArr = br.readLine().toCharArray();
			arr = new int[26];
			isGroup = true;
			
			if (chArr.length == 1) {
				groupCount++;
				continue;
			}
			
			arr[chArr[0] - 97]++;
			for (int j = 1; j < chArr.length; j++) {
				char ch = chArr[j];
				int idx = ((int) ch) - 97;
				arr[idx]++;
				
				if (arr[idx] > 1 && Character.compare(chArr[j-1], ch) != 0) {
					isGroup = false;
					break;
				}
			}
			
			if (isGroup) {
				groupCount++;
			}
		}
		
		System.out.println(groupCount);
		
		br.close();
	}
}
