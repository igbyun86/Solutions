package hackerrank.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {
	

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
        String binary = Integer.toBinaryString(n);
        
        char[] binaryArray = binary.toCharArray();
        
        int maxNum = 0;
        int seq = 0;
        for (int i = 0; i < binaryArray.length; i++) {
			char ch = binaryArray[i];
			
			if(ch == '1'){
				seq++;
			}
			else{
				seq = 0;
			}
			
			if(maxNum < seq){
				maxNum = seq;
			}
		}
        
        System.out.println(maxNum);
        
        scanner.close();
    }
}
