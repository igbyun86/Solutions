package hackerrank.Interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingontheClouds {

    static int jumpingOnClouds(int[] c) {
		
    	int jumpCount = 0;
    	int safeCount = 0;
    	boolean isValidJump = false;
    	
    	for(int i= 0; i < c.length; i++){
    		int num = c[i];
    		
    		if(num == 1){
    			safeCount = 0;
    		}
    		else{
    			safeCount++;
    		}
    		
    		if(num == 0 && safeCount < 3 && isValidJump){
    			jumpCount++;
    		}
    		else if(safeCount == 3){
    			safeCount = 1;
    		}
    		
    		if(!isValidJump && num == 0){
    			isValidJump = true;
    		}
    	}
    	
    	return jumpCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
        
        scanner.close();
    }
}
