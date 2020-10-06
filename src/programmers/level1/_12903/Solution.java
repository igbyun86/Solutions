package programmers.level1._12903;

/**
 * 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
	
	public static String solution(String s) {
		String answer = "";
		int startIndex = s.length() / 2;
		if (s.length() % 2 == 1) {
			answer = s.substring(startIndex, startIndex + 1);
		} else {
			answer = s.substring(startIndex - 1, startIndex + 1);
		}
		
        return answer;
    }
}
