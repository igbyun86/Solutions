package baekjoon.math._1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		int c = Integer.parseInt(strArr[2]);
		
		if (b >= c) {
			System.out.println(-1);
			return;
		}

		int count = a / (c - b) + 1;
		System.out.println(count);
		
		br.close();
	}
}
