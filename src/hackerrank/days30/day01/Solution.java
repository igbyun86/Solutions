package hackerrank.days30.day01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
	int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
	Scanner scan = new Scanner(System.in);
        int num = scan.nextInt() + i;
        double l = scan.nextDouble() + d;
        scan.nextLine();
        String str = s + scan.nextLine();
        
        
        System.out.println(num);
        System.out.println(l);
        System.out.println(str);

        scan.close();
		
	}
}
