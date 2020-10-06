package programmers.level1._12930;

/**
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("try hello world TTT"));
		System.out.println(solution("try  ddd  "));
	}
	
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		String[] words = s.split(" ");
		
		int blankCount = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				blankCount++;	
			}
			else break;
		}
		
		for (int i = 0; i < words.length; i++) {
			String[] strArr = words[i].split("");
			for (int j = 0; j < strArr.length; j++) {
				String str = strArr[j];
				if (j % 2 == 0) {
					str = str.toUpperCase();	
				} else {
					str = str.toLowerCase();
				}
				
				sb.append(str);
			}
			
			if (i < words.length - 1) {
				sb.append(" ");
			}
		}
		
		if (blankCount > 0) {
			sb.append(s.substring(s.length() - blankCount, s.length()));
		}

        return sb.toString();
    }
}
