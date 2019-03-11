package hackerrank.problem;

import java.math.BigDecimal;
import java.util.Scanner;

public class MinMaxSum {


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	BigDecimal min = BigDecimal.ZERO;
    	BigDecimal max = BigDecimal.ZERO;
    	
    	BigDecimal sum = BigDecimal.ZERO;
    	for (int i = 0; i < arr.length; i++) {
    		sum = BigDecimal.ZERO;
    		for (int j = 0; j < arr.length; j++) {
    			if(i != j){
    				sum = sum.add(new BigDecimal(arr[j]));
    			}
			}
    		
    		// min, max check
        	if(min.intValue() == 0 && max.intValue() == 0){
        		min = sum;
        		max = sum;
        	}
        	else if(min.compareTo(sum) == 1){
        		min = sum;
        	}
        	else if(max.compareTo(sum) == -1){
        		max = sum;
        	}
		}
    	
    	System.out.println(String.format("%.0f %.0f", min.doubleValue(), max.doubleValue()));
    }
    
    // 256741038 623958417 467905213 714532089 938071625

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
