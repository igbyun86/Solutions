package programmers.level1._12943;

/**
 * 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}
	
	public static int solution(int num) {
        int count = 0;
        long n = num;
        
        while (n != 1) {
        	if (n % 2 == 0) {
        		n = n / 2;
        	}
        	else {
        		n = n * 3 + 1;
        	}
        	
        	count++;
        	
        	if (count > 500) {
        		return -1;
        	}
        }
        
        return count;
    }
}
