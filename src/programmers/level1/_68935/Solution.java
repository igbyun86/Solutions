package programmers.level1._68935;

/**
 * 3진법 뒤집기
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
	}
	
	public static int solution(int n) {
		int mockNum = n;
		int restNum = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while (mockNum > 2) {
			restNum = mockNum % 3;
			mockNum = mockNum / 3;
			sb.append(String.valueOf(restNum));
		}
		sb.append(String.valueOf(mockNum));
		
		int result = 0;
		String[] strArr = sb.toString().split("");
		for (int i = strArr.length - 1; i >= 0; i--) {
			int num = Integer.parseInt(strArr[i]); 
			if (strArr.length - 1 == i) {
				result = num;
			} else {
				result += num * Math.pow(3, strArr.length - i - 1);
			}
		}
        return result;
    }
}
