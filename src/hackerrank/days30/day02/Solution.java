package hackerrank.days30.day02;

import java.util.Scanner;

public class Solution {

	static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double tip = meal_cost * tip_percent /100.0;
		double tax = meal_cost * tax_percent /100.0;
		double total = meal_cost + tip + tax;   
		
		int totalCost = (int) Math.round(total);
		
		System.out.println(totalCost);
    }


    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
