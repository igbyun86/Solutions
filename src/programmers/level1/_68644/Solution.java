package programmers.level1._68644;

import java.util.*;

/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr1 = {2,1,3,4,1};
		int[] arr2 = {5,0,2,7};
		
		int[] answer = solution(arr2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		int len = numbers.length;
        for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

        int[] answer = new int[set.size()];
        int k = 0;
        for (int n : set) {
			answer[k++] = n;
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
}
