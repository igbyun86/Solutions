package baekjoon.greedy._1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 잃어버린 괄호
 * https://www.acmicpc.net/problem/1541
 * @author big
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strArr = str.split("-");
		String plus = strArr[0];
		
		int plusSum = stringArrSum(plus.split("[+]"));
		int minusSum = 0;
		
		for (int i = 1; i < strArr.length; i++) {
			minusSum += stringArrSum(strArr[i].split("[+]"));
		}
		
		System.out.println(plusSum - minusSum);
		
		br.close();
	}
	
	private static int stringArrSum(String[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		return sum;
	}
}
