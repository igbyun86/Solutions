package programmers.hash01;

import java.util.*;
import java.util.Map.Entry;

/**
 * 완주하지 못한 선수
 * @author big
 *
 */
public class Solution {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> pMap = new HashMap<String, Integer>();
        
        for (int i = 0; i < participant.length; i++) {
        	String key = participant[i];
        	if(pMap.containsKey(key)){
        		pMap.replace(key, pMap.get(key) + 1);
        	}
        	else{
        		pMap.put(key, 1);
        	}
		}
        
        for (int i = 0; i < completion.length; i++) {
			String key = completion[i];
			
			if(pMap.containsKey(key)){
				if(pMap.get(key) - 1 > 0){
					pMap.replace(key, pMap.get(key) - 1);
				}
				else{
					pMap.remove(key);
				}
        	}
        	else{
        		pMap.remove(key);
        	}
        }
        
        for (Map.Entry<String, Integer> entry : pMap.entrySet()) {
			answer = entry.getKey();
		}

        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav", "ana", "ana", "ana", "ana", "ana", "stanko", "stanko", "stanko", "ingil"};
		String[] completion = {"mislav", "stanko", "mislav", "ana", "mislav", "ana", "ana", "ana", "ana", "ana", "stanko", "stanko", "stanko"};
		
		String answer = solution(participant, completion);
		System.out.println(answer);
		
	}
}

