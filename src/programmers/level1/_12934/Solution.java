package programmers.level1._12934;

/**
 * 정수 제곱근 판별
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
		
	}
	
	public static long solution(long n) {
		double sqrtNum = Math.sqrt(n);
		
		if (Math.floor(sqrtNum) == sqrtNum) {
			long num = (long) (sqrtNum + 1.0);
			return num *= num;
		}
		
        return -1;
    }
}
