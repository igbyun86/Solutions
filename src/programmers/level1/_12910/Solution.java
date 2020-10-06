package programmers.level1._12910;

import java.util.*;

/**
 * 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 * @author big
 *
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		int[] arr2 = {2,36,1,3};
		int divisor2 = 1;
		
		int[] arr3 = {3,2,6};
		int divisor3 = 10;
		
		int[] answer = solution(arr3, divisor3);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		int[] answer;
		if (list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			
			Arrays.sort(answer);
		}
        
        return answer;
    }
}
