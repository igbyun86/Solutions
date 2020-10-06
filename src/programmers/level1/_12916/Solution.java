package programmers.level1._12916;

/**
 * 문자열 내 p와 y의 개수
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
	
	private static boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        String[] arr = s.split("");
        boolean isOdd = (s.length() % 2 == 1 ? true : false);
        int halfIndex = s.length() / 2;
        
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < halfIndex; i++) {
        	if ("p".equals(arr[i])) {
        		pCount++;
        	} else if ("y".equals(arr[i])) {
        		yCount++;
        	}
        	
        	if ("p".equals(arr[s.length() - 1 - i])) {
        		pCount++;
        	} else if ("y".equals(arr[s.length() - 1 - i])) {
        		yCount++;
        	}
        }
        
        if (isOdd) {
        	if ("p".equals(arr[halfIndex])) {
        		pCount++;
        	} else if ("y".equals(arr[halfIndex])) {
        		yCount++;
        	}
        }
        
        if (pCount != yCount) {
        	answer = false;
        }

        return answer;
    }
	
}
