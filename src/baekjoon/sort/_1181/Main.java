package baekjoon.sort._1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		String[] strArr = new String[n];
		for (int i = 0; i < n; i++) {
			strArr[i] = br.readLine();
		}
		
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		Set<String> hs = new LinkedHashSet<>();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			hs.add(strArr[i]);
		}
		
		hs.forEach(s -> {
			sb.append(s + "\n");
		});
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
