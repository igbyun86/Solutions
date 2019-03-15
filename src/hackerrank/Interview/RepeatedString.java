package hackerrank.Interview;

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;

public class RepeatedString {

	
	static long repeatedString(String s, long n) {
		long result = 0;
		long strSum = 0;
		int strLength = s.length();
		
		char[] strList = s.toCharArray();
		for(int i=0; i<strList.length; i++){
			char ch = strList[i];
			
			if(ch == 'a'){
				strSum++;
			}
		}
		
		long p = n / strLength;
		int r = (int) (n % strLength);
		
		strList = s.substring(0,r).toCharArray();
		int restNum = 0;
		for(int i=0; i<strList.length; i++){
			char ch = strList[i];
			
			if(ch == 'a'){
				restNum++;
			}
		}
		result = p * strSum + restNum;
		
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(String.valueOf(result));

        scanner.close();
    }
    
}
