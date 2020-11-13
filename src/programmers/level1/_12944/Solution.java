package programmers.level1._12944;

/**
 * 평균 구하기
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));
		
		int[] arr2 = {5,5};
		System.out.println(solution(arr2));
		
	}
	
	public static double solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        
        return sum / (arr.length * 1.0);
    }
}
