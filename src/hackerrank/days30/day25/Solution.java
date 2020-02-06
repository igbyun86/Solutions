package hackerrank.days30.day25;

import java.util.Scanner;

/**
 * Day 25: Running Time and Complexity
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        int[] numArr = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            numArr[i] = sc.nextInt();
        }

        sc.close();

        /**
         * 소수는 제곱근보다 작은 수의 배수로 나누어지지 않을 경우
         */
        for (int i = 0; i < numArr.length; i++) {
        	int num = numArr[i];
        	int rootSqrt = (int) Math.sqrt(num);

        	String result = (num == 1 ? "Not prime" : "Prime");
        	for (int j = 2; j <= rootSqrt; j++) {
				if(num % j == 0) {
					result = "Not prime";
					break;
				}
			}

        	System.out.println(result);
        }
	}
}
