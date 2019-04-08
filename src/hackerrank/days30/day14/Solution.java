package hackerrank.days30.day14;

import java.util.*;

class Difference {
	private int[] elements;
	
  	public Difference(int[] a) {
  		this.elements = a;
	}
  	
	
  	public int maximumDifference;

	public void computeDifference() {
		maximumDifference = 0;
		int result = 0;
		for (int i = 0; i < this.elements.length; i++) {
			
			for (int j = i+1; j < elements.length; j++) {
				result = this.elements[i] - this.elements[j];
				result = Math.abs(result);
				
				if(maximumDifference < result){
					maximumDifference = result;
				}
			}
		}
		
		/*
		int maxNum = Arrays.stream(elements).max().getAsInt();
        int minNum = Arrays.stream(elements).min().getAsInt();     
        maximumDifference = maxNum - minNum;
		
		*/
	}
}

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
