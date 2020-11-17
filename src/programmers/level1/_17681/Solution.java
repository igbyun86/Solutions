package programmers.level1._17681;

/**
 * 비밀지도
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] arr = solution(n, arr1, arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] answer = new String[n];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String[] strArr1 = lpad(Integer.toBinaryString(arr1[i]), n).split("");
			String[] strArr2 = lpad(Integer.toBinaryString(arr2[i]), n).split("");
			sb.setLength(0);
			for (int j = 0; j < n; j++) {
				int n1 = Integer.parseInt(strArr1[j]);
				int n2 = Integer.parseInt(strArr2[j]);
				if (n1 == 1 || n2 == 1) {
					sb.append("#");
				} else {
					sb.append(" ");
				}
			}
			answer[i] = sb.toString();
		}
        return answer;
    }
	
	public static String lpad(String s, int n) {
		StringBuilder sb = new StringBuilder();
		int cnt = n - s.length();
		for (int i = 0; i < cnt; i++) {
			sb.append("0");
		}
		sb.append(s);
		
		return sb.toString();
	}
}
