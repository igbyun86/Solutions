package hackerrank.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = "";
        for (int i = arrItems.length-1; i >= 0; i--) {
        	if(i == 0){
        		result += arrItems[i]; 
        	}
        	else{
        		result += arrItems[i] + " ";
        	}
		}
        
        System.out.println(result);

        scanner.close();
    }
	
}
