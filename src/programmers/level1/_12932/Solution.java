package programmers.level1._12932;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int [] arr = solution(12345);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(String.valueOf(arr[i]));
		}
		
		System.out.println(sb.toString());
	}
	
	public static int[] solution(long n) {
		String[] strArr = String.valueOf(n).split("");
        int[] answer = new int[strArr.length];
        int index = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
        	answer[index++] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}
