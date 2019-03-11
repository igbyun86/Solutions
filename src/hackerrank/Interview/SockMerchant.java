package hackerrank.Interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	HashSet<Integer> hs = new HashSet<>();
		
		int pairCount = 0;
    	for(int i=0; i<ar.length; i++){
    		int num = ar[i]; 
    		
    		if(hs.contains(num)){
    			pairCount++;
    			hs.remove(num);
    		}
    		else{
    			hs.add(num);
    		} 
    	}
    	
    	return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
        System.out.println(result);
        scanner.close();
    }
    
}
