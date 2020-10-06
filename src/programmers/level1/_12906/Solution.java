package programmers.level1._12906;

/**
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		int[] answer = solution(arr2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] solution(int []arr) {
		int arrLength = 1;
		for (int i = arr.length - 1; i > 0 ; i--) {
			if (arr[i-1] == arr[i]) {
				arr[i] = -1;
			} else {
				arrLength++;
			}
		}
		
        int[] answer = new int[arrLength];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > -1) {
        		answer[index++] = arr[i];
        	}
		}

        return answer;
    }
}
