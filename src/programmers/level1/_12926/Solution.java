package programmers.level1._12926;

/**
 * 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		/*
		System.out.println((int) 'A');	//65
		System.out.println((int) 'Z');	//90
		System.out.println((int) 'a');	//97
		System.out.println((int) 'z');	//122
		System.out.println((int) ' ');	//32
		*/
		
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}
	public static String solution(String s, int n) {
		int plusNum = n % 26;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int chNum = (int) s.charAt(i);
			// blank
			if (chNum == 32) {
				sb.append(" ");
				continue;
			}
			
			int result = chNum + plusNum;
			if (chNum <= 90) {
				result = (result > 90 ? result - 90 + 64 : result);
			} else {
				result = (result > 122 ? result - 122 + 96 : result);
			}
			
			sb.append((char) result);
		}

		return sb.toString();
    }
}
