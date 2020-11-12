package programmers.level1._12937;

/**
 * 짝수와 홀수
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
