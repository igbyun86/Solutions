package programmers.level1._42862;

/**
 * 체육복
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		/*
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		*/
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		int answer = solution(n, lost, reserve);
		System.out.print(answer);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] arr = new int[n+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = 1;
		}
		
		for (int i = 0; i < reserve.length; i++) {
			arr[reserve[i]]++;
		}
		
		for (int i = 0; i < lost.length; i++) {
			arr[lost[i]]--;
		}
		
		int result = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 1) {
				if (arr[i - 1] > 1) {
					arr[i]++;
					arr[i - 1]--;
				}
				else if(i < arr.length - 1) {
					if (arr[i + 1] > 1) {
						arr[i]++;
						arr[i + 1]--;	
					}
				}
			}
			
			if (arr[i] > 0) {
				result++;
			}
		}
		
        return result;
    }
}
