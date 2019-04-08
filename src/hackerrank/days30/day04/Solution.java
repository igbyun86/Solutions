package hackerrank.days30.day04;

import java.io.*;
import java.util.*;

public class Solution {

	private int age;	
	  
	public Solution(int initialAge) {
		this.age = initialAge;
		
		if(this.age < 0){
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void amIOld() {
		String s = "";
		if(this.age < 13){
			s = "You are young.";
		}
		else if(this.age >= 13 && this.age < 18){
			s = "You are a teenager.";
		}
		else{
			s = "You are old.";
		}
		
		System.out.println(s);
	}

	public void yearPasses() {
  		this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Solution p = new Solution(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println(i);
			System.out.println();
        }
		sc.close();
    }
}
