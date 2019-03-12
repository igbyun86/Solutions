package hackerrank.Interview;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		
		int U = 0;
		int D = 0;
		int preD = 0;
		int valleyCount = 0;
		
		for(int i=0; i<n; i++){
			String str = s.substring(i, i+1);
			str = str.toUpperCase();
			
			if("U".equals(str)){
				U++;
			}
			else{
				D++;
			}
			
			if(U - D == 0 && preD == U){
				valleyCount++;
			}
			
			if("D".equals(str)) preD++; 
		}
		
		return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));
        

        scanner.close();
    }
}
