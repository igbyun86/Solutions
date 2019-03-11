package hackerrank.problem;

import java.util.Scanner;

public class Staircase {
	
	static void staircase(int n) {
		
		for (int i = 0; i < n; i++) {
			String formatStr = String.format("%%%ds", n);
			String str = "#";
			
			for(int j = 0; j < i; j++){
				str = str + "#";
			}
				
			String result = String.format(formatStr, str);
			System.out.println(result);
		}
    }
	
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
		
	}
}
