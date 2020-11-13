package programmers.level1._12940;


/**
 * 최대공약수와 최소공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		int[] arr = solution(3, 12);
		System.out.println(arr[0] + "/" + arr[1]);
		
		arr = solution(2, 5);
		System.out.println(arr[0] + "/" + arr[1]);
		
	}
	
	public static int[] solution(int n, int m) {
        int[] arr = new int[2];
        int a = n;
        int b = m;
        
        while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
        
        arr[0] = a;			// 최대공약수
        arr[1] = n * m / a;	// 최소공배수
        
        return arr;
    }
}
