package programmers.level1._12919;

/**
 * 서울에서 김서방 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		int index = 0;
		for (index = 0; index < seoul.length; index++) {
			if ("Kim".equals(seoul[index])) break;
		}
        
        return String.format("김서방은 %d에 있다", index);
    }
}
