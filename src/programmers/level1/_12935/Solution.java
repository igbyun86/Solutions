package programmers.level1._12935;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] result = solution(arr);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] solution(int[] arr) {
		if (arr.length == 1) {
			int[] answer = {-1};	 
			return answer;
		}
		
		int[] tempArr = arr.clone();
		int[] result = new int[arr.length-1];
		Arrays.sort(arr);
		int minNum = arr[0];
		
		int addIndex = 0;
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == minNum) {
				addIndex = -1;
				continue;
			}
			
			result[i + addIndex] = tempArr[i];
		}
		
        return result;
    }
}
