package hackerrank.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day03 {

	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = "";
        if(N%2 == 0 && N > 20){
        	s = "Not Weird";
        }
        else if(N%2 == 0 && N >= 6 && N <= 20){
        	s = "Weird";
        }
        else if(N%2 == 0 && N >= 2 && N <= 5){
        	s = "Not Weird";
        }
        else{
        	s = "Weird";
        }
        
        System.out.println(s);
        
        scanner.close();
    }
    
    
}
