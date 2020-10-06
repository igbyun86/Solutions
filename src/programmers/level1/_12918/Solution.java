package programmers.level1._12918;

/**
 * 문자열 다루기 기본
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
	
	public static boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return false;
		}
		
        return true;
    }
}
