package programmers.level2._42586;

import java.util.*;


/**
 * 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		//int[] progresses = {95, 90, 99, 99, 80, 99};
		//int[] speeds = {1, 1, 1, 1, 1, 1};
		
		int[] arr = solution(progresses, speeds);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();
		int startIndex = 0;
		int distributeCnt = 0;
		while (startIndex < progresses.length) {
			distributeCnt = 0;
			
			for (int i = startIndex; i < progresses.length; i++) {
				progresses[i] += speeds[i];
				
				if (progresses[startIndex] >= 100) {
					distributeCnt++;
					startIndex++;
				} else if (progresses[startIndex] >= 100 && progresses[i - 1] >= 100 && progresses[i] >= 100) {
					distributeCnt++;
					startIndex = i + 1;
				}
			}
			
			if (distributeCnt > 0) {
				list.add(distributeCnt);
			}
		}
		
        int[] answer = new int[list.size()];
        int i = 0;
        for (int cnt : list) {
			answer[i++] = cnt;
		}
        
        return answer;
    }
}
