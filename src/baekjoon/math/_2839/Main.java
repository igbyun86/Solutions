package baekjoon.math._2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = n / 5;
		int b = -1;
		
		while(a > -1) {
			if((n - (5 * a)) % 3 == 0) {
				b = (n - (5 * a)) / 3;
				break;
			}
			
			a--;
		}
		
		int result = (b == -1 ? b : (a+b));
		System.out.println(result);
		
		br.close();
	}
}
