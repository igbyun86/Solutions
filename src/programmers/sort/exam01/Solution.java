package programmers.sort.exam01;

import java.util.Arrays;

/**
 * K번째수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * @author big
 *
 */
public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
    	for (int i = 0; i < commands.length; i++) {
    		int[] arr = commands[i];
    		int startIndex = arr[0];
    		int endIndex = arr[1];
    		int findIndex = arr[2];
    		
    		int[] newArr = new int[endIndex - startIndex + 1];
    		int k = 0;
    		for (int j = startIndex-1; j < endIndex; j++) {
    			newArr[k++] = array[j];
			}
    		
    		Arrays.sort(newArr);
    		answer[i] = newArr[findIndex - 1];
		}
    	
        return answer;
    }
    
    public static void main(String[] args) {
		
    	int[] array = {1, 5, 2, 6, 3, 7, 4};
    	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	
    	int[] result = solution(array, commands);
    	for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}