package programmers.hash03;

import java.util.*;

/**
 * 위장
 * @author big
 *
 */
public class Solution {

	public static int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
			String[] strArr = clothes[i];
			String key = strArr[1];
			
			if(map.containsKey(key)){
				map.put(key, map.get(key) + 1);
			}
			else{
				map.put(key, 2);
			}
		}

        answer = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	answer *= entry.getValue();
		}
        
        answer--;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		//String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {
								{"crow_mask", "face"}, {"mustache", "face"}, {"smoky_makeup", "face"}
								, {"yellow_hat", "headgear"}, {"green_turban", "headgear"}
								, {"blue_sunglasses", "eyewear"}, {"red_sunglasses", "eyewear"}, {"black_sunglasses", "eyewear"}, {"green_sunglasses", "eyewear"}, {"orange_sunglasses", "eyewear"}
							};
		
		int answer = solution(clothes);
		System.out.println(answer);
		
	}
	
}
