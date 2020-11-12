package programmers.level1._12933;

import java.util.Arrays;

/**
 * 정수 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	
	public static long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
		
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
        	sb.append(String.valueOf(strArr[i]));
        }
		
        return Long.parseLong(sb.toString());
    }
}
