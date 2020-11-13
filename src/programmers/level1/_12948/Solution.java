package programmers.level1._12948;

/**
 * 핸드폰 번호 가리기
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
	
	public static String solution(String phone_number) {
		if (phone_number.length() == 4) {
			return phone_number;
		}
		
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
        	sb.append("*");
        }
        
        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));
        
        return sb.toString();
    }
}
