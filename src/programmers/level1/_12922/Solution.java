package programmers.level1._12922;

/**
 * 수박수박수박수박수박수?
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		String word = "수박";
		if (n == 1) return "수";
		if (n == 2) return word;
		
		int halfNum = n / 2;
		boolean isOdd = (n % 2 == 1 ? true : false);
		for (int i = 0; i < halfNum; i++) {
			sb.append(word);
		}
		
		if (isOdd) {
			sb.append("수");
		}
        
        return sb.toString();
    }
}
