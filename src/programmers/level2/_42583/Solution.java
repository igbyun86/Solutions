package programmers.level2._42583;

import java.util.*;


/**
 * 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10; 
		int[] truck_weights = {7,4,5,6};
		
		int bridge_length2 = 100;
		int weight2 = 100; 
		int[] truck_weights2 = {10};
		
		int bridge_length3 = 100;
		int weight3 = 100; 
		int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
		System.out.println(solution(bridge_length2, weight2, truck_weights2));
		System.out.println(solution(bridge_length3, weight3, truck_weights3));
		
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int totalTime = 0;
		int arrIndex = 0;
		int totalWeight = 0;
		List<Truck> list = new ArrayList<>();
		
		while (true) {
			if (arrIndex < truck_weights.length) {
				int truck_weight = truck_weights[arrIndex];
				
				if (totalWeight + truck_weight <= weight) {
					totalWeight += truck_weight;
					
					list.add(new Truck(truck_weight, bridge_length));
					arrIndex++;
				}
			}
			
			Iterator<Truck> it = list.iterator();
			while (it.hasNext()) {
				Truck t = it.next();
				int length = t.minusBridgeLength();
				if (length == 0) {
					totalWeight -= t.getWeight();
					it.remove();
				}
			}
			totalTime++;
			
			if (arrIndex == truck_weights.length && list.size() == 0) break;
		}

		return totalTime + 1;
    }
}

class Truck {
	private int weight;
	private int bridge_length;
	
	public Truck(int weight, int bridge_length) {
		this.weight = weight;
		this.bridge_length = bridge_length;
	}

	public int minusBridgeLength() {
		return --bridge_length;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
