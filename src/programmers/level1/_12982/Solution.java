package programmers.level1._12982;

import java.util.Arrays;

/**
 * 예산
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,3,2,5,4};
		System.out.println(solution(arr, 9));
	}
	
	public static int solution(int[] d, int budget) {
        int maxNum = 0;
		
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
        	if (budget - d[i] < 0) {
        		return maxNum;
        	}
        	budget -= d[i];
        	maxNum++;
        }
		
        return maxNum;
    }
}
