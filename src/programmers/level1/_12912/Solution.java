package programmers.level1._12912;

/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		int startIndex, endIndex;
		if (a > b) {
			startIndex = b;
			endIndex = a;
		} else if (a < b) {
			startIndex = a;
			endIndex = b;
		} else {
			return a;
		}
		
		for (int i = startIndex; i <= endIndex; i++) {
			answer += i;
		}
		
        return answer;
    }
}
