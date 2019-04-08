package hackerrank.days30.day09;

import java.io.*;
import java.util.*;

public class Solution {

	static int factorial(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result = i * result;
		}
		
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(String.valueOf(result));
        
        scanner.close();
    }
}
