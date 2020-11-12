package programmers.level1._67256;

/**
 * 키패드 누르기
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		//LRLLRRLLLRR
		//LRLLRRLLLRR
		System.out.println(solution(numbers, hand));
	}
	
	public static String solution(int[] numbers, String hand) {
		int[][] indexArr = {
				{3,1},{0,0},{0,1},{0,2},{1,0} 
				,{1,1},{1,2},{2,0},{2,1},{2,2}
		};	// 0 ~ 9 index(x, y)
		
		int leftNum = -1;
		int rightNum = -1;
		int[] leftIndex = {3,0};
		int[] rightIndex = {3,2};
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if (num == 1 || num == 4 || num == 7) {
				leftNum = num;
				sb.append("L");
			}
			else if (num == 3 || num == 6 || num == 9) {
				rightNum = num;
				sb.append("R");
			}
			else {
				if (leftNum > -1) {
					leftIndex = indexArr[leftNum];
				}
				
				if (rightNum > -1) {
					rightIndex = indexArr[rightNum];
				}
				
				int[] index = indexArr[num];
				
				int leftMove = Math.abs(leftIndex[0] - index[0]) + Math.abs(leftIndex[1] - index[1]);
				int rightMove = Math.abs(rightIndex[0] - index[0]) + Math.abs(rightIndex[1] - index[1]);
				
				if (leftMove == rightMove) {
					if ("right".equals(hand)) {
						rightNum = num;
						sb.append("R");
					} 
					else {
						leftNum = num;
						sb.append("L");
					}
				} 
				else {
					if (leftMove < rightMove) {
						leftNum = num;
						sb.append("L");
					}
					else {
						rightNum = num;
						sb.append("R");
					}
				}
				
			}
		}
		
		
        return sb.toString();
    }
}
