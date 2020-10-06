package programmers.level1._12915;

import java.util.*;

/**
 * 문자열 내 마음대로 정렬하기
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		String[] strings2 = {"abce", "abcd", "cdx"};
		int n2 = 2;
		
		String[] answer = solution(strings2, n2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String str1 = s1.substring(n, n + 1);
				String str2 = s2.substring(n, n + 1);
				
				if (str1.equals(str2)) {
					return s1.compareTo(s2);
				}
				
				return str1.compareTo(str2);
			}
		});
		
        return strings;
    }

}
