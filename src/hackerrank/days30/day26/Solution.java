package hackerrank.days30.day26;

import java.util.Scanner;

/**
 * Day 26: Nested Logic
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {

		int[] actualArr = new int[3];
		int[] expectedArr = new int[3];

		Scanner sc = new Scanner(System.in);

		String actual = sc.nextLine();
		String expected = sc.nextLine();

		sc.close();

		String[] tempStr1 = actual.split(" ");
		String[] tempStr2 = expected.split(" ");
		for (int i = 0; i < tempStr1.length; i++) {
			actualArr[i] = Integer.parseInt(tempStr1[i]);
		}

		for (int i = 0; i < tempStr2.length; i++) {
			expectedArr[i] = Integer.parseInt(tempStr2[i]);
		}

		int hackos = 0;
		if(actualArr[0] > expectedArr[0] && actualArr[1] == expectedArr[1] && actualArr[2] == expectedArr[2]) {
			hackos = (actualArr[0] - expectedArr[0]) * 15;
		}
		if(actualArr[1] > expectedArr[1] && actualArr[2] == expectedArr[2]) {
			hackos = (actualArr[1] - expectedArr[1]) * 500;
		}
		if(actualArr[2] > expectedArr[2]) {
			hackos = 10000;
		}

		System.out.println(hackos);
	}
}
