package programmers.level1._12950;


/**
 * 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		//int[][] arr1 = {{1,2},{2,3}};
		//int[][] arr2 = {{3,4},{5,6}};
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		int[][] arr = solution(arr1, arr2);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) {
					System.out.print(arr[i][j]);	
				} else {
					System.out.print("," + arr[i][j]);	
				}
			}
			System.out.println();
		}
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
        
        return arr;
    }
}
