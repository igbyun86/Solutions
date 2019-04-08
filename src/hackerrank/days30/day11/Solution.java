package hackerrank.days30.day11;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
						+arr[i+1][j+1] 
						+arr[i+2][j] +arr[i+2][j+1] +arr[i+2][j+2]; 
				
				if(i == 0 && j == 0) maxSum = sum;
				
				if(maxSum < sum){
					maxSum = sum;
				}
			}
		}
        
        System.out.println(maxSum);

        scanner.close();
    }
}
