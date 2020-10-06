package programmers.level1._12928;

/**
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(5));
		System.out.println(solution(100));
		System.out.println(solution(3000));
	}
	
	public static int solution(int n) {
		if (n == 1) {
			 return 1;
		}
		
		int answer = 0;
		int lastIndex = n;
		for (int i = 1; i <= lastIndex; i++) {
			if (n % i == 0) {
				if (i == (n / i)) {
					answer += i;
				} else {
					answer += (i + (n / i));	
				}
				
				lastIndex = n / (i + 1);
			}
		}
		
        return answer;
    }
}
