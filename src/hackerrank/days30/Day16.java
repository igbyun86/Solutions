package hackerrank.days30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        	System.out.println(Integer.parseInt(S));
		} catch (Exception e) {
			System.out.println("Bad String");
		}
	}
}
