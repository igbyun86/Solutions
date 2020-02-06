package hackerrank.days30.day29;

import java.util.Scanner;

/**
 * Day 29: Bitwise AND
 * @author big
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = sc.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int result = 0;
            for (int i = 1; i < n; i++) {
            	for (int j = i+1; j <= n; j++) {

					if((i & j) < k) {
						result = Math.max((i & j), result);
					}
				}
			}

            System.out.println(result);
        }

        sc.close();
    }
}
