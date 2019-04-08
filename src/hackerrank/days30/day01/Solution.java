package hackerrank.days30.day01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double l = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        
        int a = n + i;
        l = Double.parseDouble(String.format("%.1f",l));
        l = l + d;
        
        str = s + str;
        
        System.out.println(a);
        System.out.println(l);
        System.out.println(str);

        scan.close();
		
	}
}
