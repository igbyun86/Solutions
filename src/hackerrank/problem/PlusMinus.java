package hackerrank.problem;

import java.math.BigDecimal;
import java.util.Scanner;

public class PlusMinus {
	
	static void plusMinus(int[] arr) {
		BigDecimal size = new BigDecimal(arr.length);
		int posiCnt = 0;
		int negaCnt = 0;
		int zeroCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            
            if(a > 0){
            	posiCnt++;
            }
            else if(a < 0){
            	negaCnt++;
            }
            else{
            	zeroCnt++;	
            }
        }
        
        System.out.println(new BigDecimal(posiCnt).divide(size, 6, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(negaCnt).divide(size, 6, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(zeroCnt).divide(size, 6, BigDecimal.ROUND_HALF_UP));
        
    }
	
	
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
	}
}
