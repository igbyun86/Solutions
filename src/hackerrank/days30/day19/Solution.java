package hackerrank.days30.day19;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisorSum(int n);
}

class CalculatorEx implements AdvancedArithmetic {
	
    public int divisorSum(int n) {
    	int sum = 0;
    	
    	/*
    	for (int i = 1; i <= n; i++) {
    		if(n % i == 0) sum += i;
		}
    	*/
    	
    	int sqrt = (int) Math.sqrt(n);
        int stepSize = (n % 2 == 1) ? 2 : 1;

        for (int i = 1; i <= sqrt; i += stepSize) {
            if (n % i == 0) { 
                sum += i + n/i;
            }
        }

        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
    	
        return sum;
    }
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new CalculatorEx();
      	
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
	}
}
