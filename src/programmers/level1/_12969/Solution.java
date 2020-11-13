package programmers.level1._12969;

/**
 * 직사각형 별찍기
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
