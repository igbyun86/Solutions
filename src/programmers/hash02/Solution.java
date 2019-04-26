package programmers.hash02;

import java.util.*;
import java.util.stream.Collectors;


/**
 * 전화번호 목록
 * @author big
 *
 */
public class Solution {
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> list = null;
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < phone_book.length; i++) {
        	String key = phone_book[i];
			map.put(key, 1);
			
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        	list =  map.entrySet().stream().filter(en -> en.getKey().indexOf(entry.getKey()) == 0)
	        								.map(en -> en.getKey())
	        								.collect(Collectors.toList());
	        	
	        	if(list.size() > 1){
	        		answer = false;
	        		return false;
	        	}
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//String[] phone_book = {"123", "456", "789"};
		String[] phone_book = { "567", "88","12", "123", "1235"};
		
		boolean answer = solution(phone_book);
		System.out.println(answer);
		
	}
}
