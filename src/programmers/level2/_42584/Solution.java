package programmers.level2._42584;

/**
 * 주식가격
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] arr = solution(prices);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] solution(int[] prices) {
		int[] arr = new int[prices.length];
		int cnt = 0;
		for (int i = 0; i < prices.length; i++) {
			cnt = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] <= prices[j]) cnt++;
				else {
					cnt++;
					break;
				}
			}
			arr[i] =  cnt;
		}
		
        return arr;
    }
}
