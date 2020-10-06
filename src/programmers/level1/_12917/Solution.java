package programmers.level1._12917;

import java.util.*;

/**
 * 문자열 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
		
	}
	
	public static String solution(String s) {
        char[] chArr = s.toCharArray();
        
        Arrays.sort(chArr);
        StringBuilder sb = new StringBuilder();
        for (int i = chArr.length - 1; i >= 0 ; i--) {
        	sb.append(chArr[i]);
		}
		
        return sb.toString();
    }
}
