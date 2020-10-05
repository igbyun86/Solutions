package programmers.level1._64061;

import java.util.*;

/**
 * 크레인 인형뽑기 게임
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * @author big
 *
 */
public class Solution {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = 	{1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
		int count = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int peekNum = board[j][moves[i] - 1];
				if (peekNum > 0) {
					if (stack.isEmpty()) {
						stack.add(peekNum);
					}
					else if (stack.peek() == peekNum) {
						stack.pop();
						count += 2;
					}
					else {
						stack.add(peekNum);
					}
					
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
				
        return count;
    }
	
}
