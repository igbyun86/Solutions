package programmers.level1._12947;


/**
 * 하샤드 수
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
	
	public static boolean solution(int x) {
        int sum = 0;
        String[] strArr = String.valueOf(x).split("");
        for (int i = 0; i < strArr.length; i++) {
        	sum += Integer.parseInt(strArr[i]);
        }
        
        if (x % sum > 0) {
        	return false;
        }
        
        return true;
    }
}
