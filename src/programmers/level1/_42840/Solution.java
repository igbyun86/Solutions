package programmers.level1._42840;

import java.util.*;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] answers1 = {1,2,3,4,5};
		int[] answers2 = {1,3,2,4,2};
		
		int[] answer = solution(answers1);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] solution(int[] answers) {
		int[] patternA = {1,2,3,4,5};
		int[] patternB = {2,1,2,3,2,4,2,5};
		int[] patternC = {3,3,1,1,2,2,4,4,5,5};
		
		int answerA = 0;
		int answerB = 0;
		int answerC = 0;
		for (int i = 0; i < answers.length; i++) {
			int answer = answers[i];
			
			if (patternA[i % 5] == answer) answerA++;
			if (patternB[i % 8] == answer) answerB++;
			if (patternC[i % 10] == answer) answerC++;
		}
		
		int maxNum = Math.max(Math.max(answerA, answerB), answerC);
		List<Integer> list = new ArrayList<>(Arrays.asList(answerA, answerB, answerC));
		for (int i = 0; i < list.size(); i++) {
			if (maxNum > list.get(i)) {
				list.set(i, 0);
			} else {
				list.set(i, i + 1);
			}
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			if (it.next() == 0) {
				it.remove();
			}
		}
		
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
		}
        
        return answer;
    }
}
