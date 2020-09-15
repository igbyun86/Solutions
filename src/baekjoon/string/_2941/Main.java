package baekjoon.string._2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 *크로아티아 알파벳
 *https://www.acmicpc.net/problem/2941
 * @author big
 *
 */
public class Main {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> croatiaList = Arrays.asList("c=","c-","dz=","d-","lj","nj","s=","z=");
		
		
		String inputStr = br.readLine();
		
		// 3개 확인
		// O -> 3개 replace
		// X -> 2개 확인으로
		// 2개 확인 
		// O -> 2개 replace
		// X -> 1개 replace
		int result = 0;
		while (inputStr.length() > 0) {
			int strLength = inputStr.length();
			if (strLength > 2 && "dz=".equals(inputStr.substring(0, 3))) {
				inputStr = inputStr.substring(3, strLength);
				result++;
			}
			else if (strLength > 1) {
				if (croatiaList.contains(inputStr.substring(0, 2))) {
					inputStr = inputStr.substring(2, strLength);	
				}
				else {
					inputStr = inputStr.substring(1, strLength);
				}
				result++;
			}
			else if (strLength == 1){
				inputStr = "";
				result++;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
