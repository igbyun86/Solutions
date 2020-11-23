package programmers.level1._17682;

import java.util.*;

/**
 * 다트 게임
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}
	
	public static int solution(String dartResult) {
		LinkedList<Integer> resultList = new LinkedList<Integer>();
        String[] strArr = dartResult.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strArr.length; i++) {
        	String s = strArr[i];
        	
        	if (isNumeric(s)) {
        		sb.append(s);
        		if (i + 1 < strArr.length ) {
        			if (isNumeric(strArr[i+1])) {
        				continue;
        			}
        		}
        		
        		int num = Integer.parseInt(sb.toString());
				resultList.add(num);
				continue;
        	}
        	
        	sb.setLength(0);
    		if ("D".equals(s) || "T".equals(s)) {
				int powNum = "D".equals(s) ? 2 : 3;
				
				int curNum = resultList.pollLast();
				int newNum = (int) Math.pow(curNum, powNum);
				resultList.add(newNum);
				
			} else if ("*".equals(s)) {
				if (resultList.size() == 1) {
					int curNum = resultList.pollLast();
					resultList.add(0, curNum * 2);
					
				} else {
					int curNum = resultList.pollLast();
					int befNum = resultList.pollLast();
					
					resultList.add(befNum * 2);
					resultList.add(curNum * 2);
				}
			} else if ("#".equals(s)) {
				int curNum =  resultList.pollLast() * -1;
				resultList.add(curNum);
			}
		}
        
		
        return resultList.stream()
	        			.mapToInt(Integer::intValue)
	        			.sum();
    }
	
	private static boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
