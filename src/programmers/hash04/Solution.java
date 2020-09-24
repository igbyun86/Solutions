package programmers.hash04;

import java.util.*;

/**
 * 베스트앨범
 * @author big
 *
 */
public class Solution {
    
	public static int[] solution(String[] genres, int[] plays) {
		Map<String, Integer> map = new HashMap<>();
		String[][] arr = new String[genres.length][3];
				
		
		for (int i = 0; i < genres.length; i++) {
			String genreName = genres[i];
			int playCount = plays[i];
			if (!map.containsKey(genreName)) {
				map.put(genreName, playCount);
			}
			else {
				map.put(genreName, map.get(genreName) + playCount);
			}
			
			arr[i][0] = genreName;					// genre name
			arr[i][1] = String.valueOf(playCount);	// play count
			arr[i][2] = String.valueOf(i);			// array index
		}
		
		// 장르별 재생수 desc
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		
		// 정렬된 장르의 index를 가지는 map 생성
		Map<String, Integer> orderedMap = new LinkedHashMap<>();
		int idx = 0;
		for (Map.Entry<String, Integer> entry : entries) {
			orderedMap.put(entry.getKey(), idx++);
	    }
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] s1, String[] s2) {
				if (s1[0].equals(s2[0])) {
					if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) { 
						return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
					}
					else {
						return Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1])) * -1;
					}
				}
				
				return Integer.compare(orderedMap.get(s1[0]), orderedMap.get(s2[0]));
			}
		});
		
		List<Integer> resultList = new ArrayList<>();
		resultList.add(Integer.parseInt(arr[0][2]));
		int count = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1][0].equals(arr[i][0]) && count == 2) {
				continue;
			}
			
			if (arr[i-1][0].equals(arr[i][0]) == false) {
				count = 1;
				resultList.add(Integer.parseInt(arr[i][2]));
			}
			else if (arr[i-1][0].equals(arr[i][0]) &&  count < 2) {
				count = 2;
				resultList.add(Integer.parseInt(arr[i][2]));
			}
		}
		
        int[] answer = new int[resultList.size()];
        int index = 0;
        for (int num : resultList) {
        	answer[index++] = num;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] arr = solution(genres, plays);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
