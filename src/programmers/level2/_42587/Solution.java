package programmers.level2._42587;

import java.util.*;


/**
 * 프린터
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		
		//int[] priorities = {1,1,9,1,1,1};
		//int location = 0;
		
		//int[] priorities = {1,2,3,4};
		//int location = 2;
		
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		Queue<int[]> queue = new LinkedList<>();
		int[] tempArr = new int[10];
		
		for (int i = 0; i < priorities.length; i++) {
			int[] arr = new int[2];
			arr[0] = i;
			arr[1] = priorities[i];
			queue.add(arr);
		}
		
		for (int i = 0; i < priorities.length; i++) {
			tempArr[priorities[i]]++;
		}
		
		int resultIndex = 1;
		int index = 9;
		while (index > 0) {
			int num = tempArr[index];
			if (num == 0) {
				index--;
				continue;
			}
			
			
			int[] outArr = queue.poll();
			if (outArr[1] == index) {
				tempArr[index]--;
				
				if (outArr[0] == location) {
					return resultIndex;
				}
				resultIndex++;
				continue;
			}
			
			queue.add(outArr);
		}
		
        return resultIndex;
    }

}
