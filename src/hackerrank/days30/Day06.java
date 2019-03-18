package hackerrank.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] strArray = new String[n];
		
		for (int k = 0; k < strArray.length; k++) {
			strArray[k] = sc.next();
		}
		
		
		
		String s = "";
		String oddStr = "";
		String evenStr = "";
		char [] chArray = null;
		
		for (int i = 0; i < strArray.length; i++) {
			s = strArray[i];
			chArray = s.toCharArray();
			oddStr = "";
			evenStr = "";
			for (int j = 0; j < chArray.length; j++) {
				if(j%2 == 0){
					evenStr += chArray[j];
				}
				else{
					oddStr += chArray[j];
				}
			}
			
			System.out.println(String.format("%s %s", evenStr, oddStr));
		}
		
		sc.close();
	}
}
