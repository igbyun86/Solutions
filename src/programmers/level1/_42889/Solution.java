package programmers.level1._42889;

import java.util.*;

/**
 * 실패율
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] arr = solution(N, stages);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] solution(int N, int[] stages) {
		int[] arr = new int[N + 2];
		for (int i = 0; i < stages.length; i++) {
			arr[stages[i]]++;
		}
		
		int total = stages.length;
		double[][] tempArr = new double[N][2];
		int miunsNum = 0;	// 이전 stage 참여자수 제외할 count
		for (int i = 1; i <= N; i++) {
			tempArr[i - 1][0] = i;
			if (miunsNum == total) {
				tempArr[i - 1][1] = 0;	
			}
			else {
				tempArr[i - 1][1] = arr[i] / ((total - miunsNum) * 1.0);
				miunsNum += arr[i];
			}
		}
		
		Arrays.sort(tempArr, new Comparator<double[]> () {

			@Override
			public int compare(double[] d1, double[] d2) {
				if (d1[1] == d2[1]) {
					return Double.compare(d1[0], d2[0]);
				}
				
				return Double.compare(d2[1], d1[1]);
			}
		});
		
        int[] answer = new int[N];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = (int) tempArr[i][0];
		}
        
        return answer;
    }
}
