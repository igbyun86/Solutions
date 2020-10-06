package programmers.level1._12925;

/**
 * 문자열을 정수로 바꾸기
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
	}
	
	public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
