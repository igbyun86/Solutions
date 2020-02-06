package hackerRank.days30.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 * @author big
 *
 */
public class Solution {


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	List<String> arr = new ArrayList<String>();

        int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = sc.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Pattern pattern = Pattern.compile("[a-z,.]*@gmail.com");
            Matcher match = pattern.matcher(emailID);

            if(match.matches()) {
            	arr.add(firstName);
            }
        }

        Collections.sort(arr);

        for (String str : arr) {
			System.out.println(str);
		}

        sc.close();
    }
}
