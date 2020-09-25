package programmers.sort.exam02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * @author big
 *
 */
public class Solution {
	public static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num1 = Integer.parseInt(s1 + s2);
				int num2 = Integer.parseInt(s2 + s1);
				
				return Integer.compare(num1, num2);
			}
		});
		
		boolean isZero = true;
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length-1; i >= 0 ; i--) {
			if (Integer.parseInt(arr[i]) > 0) {
				isZero = false;
			}
			sb.append(arr[i]);
		}
		
		if (isZero) {
			return "0";
		}
		
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
		int[] case1 = {6, 10, 2};
		int[] case2 = {3, 30, 34, 5, 9};
		int[] case3 = {0,0,0,0,0};
		
		System.out.println(solution(case1));
		System.out.println(solution(case2));
		System.out.println(solution(case3));
	}
}
