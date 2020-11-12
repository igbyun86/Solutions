package programmers.level1._12931;

/**
 * 자릿수 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(123));
	}
	
	public static int solution(int n) {

		String num = String.valueOf(n);
		String[] strArr = num.split("");
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}

        return sum;
    }
}
