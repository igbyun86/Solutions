package programmers.level1._12921;

import java.util.*;


/**
 * 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
		System.out.println(solution(100));
	}
	
	public static int solution(int n) {
		List<Integer> list = new ArrayList<>();
		boolean isPrime = true;
		for (int i = 2; i <= n; i++) {
			isPrime = true;
			if (i <= 3) {
				list.add(i);
			}
			else {
				int sqrtNum = (int) Math.sqrt(i);
				for (int j = 2; j <= sqrtNum; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				
				if (isPrime) {
					list.add(i);
				}
			}
		}
        return list.size();
    }
	
}
