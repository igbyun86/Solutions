package hackerrank.days30.day02;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
        
        double tip = (double) (mealCost * tipPercent / 100.0);
        double tax = (double) (mealCost * taxPercent / 100.0);
        
        int totalCoas = (int) Math.round(mealCost + tip + tax);
        
        System.out.println(totalCoas);
        
        sc.close();
    }
}
