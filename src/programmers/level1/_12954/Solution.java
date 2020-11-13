package programmers.level1._12954;


/**
 * x만큼 간격이 있는 n개의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		long[] arr = solution(2, 5);
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i]);	
			} else {
				System.out.print("," + arr[i]);
			}
		}
	}
	
	public static long[] solution(int x, int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
        	if (i == 0) {
        		arr[i] = x;	
        	} else {
        		arr[i] = arr[i - 1] + x;
        	}
        }
        
        return arr;
    }
}
