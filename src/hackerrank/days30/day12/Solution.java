package hackerrank.days30.day12;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	


    public String calculate(){
    	String result = "";
    	int sum = 0;
    	int len = this.testScores.length;
    	
    	
    	for(int i=0; i<this.testScores.length; i++){
    		sum += this.testScores[i];
    	}
    	
    	double d = sum / len;
    	
    	if(90 <= d && d <= 100){
    		result = "O";
    	}
    	else if(80 <= d && d < 90){
    		result = "E";
    	}
    	else if(70 <= d && d < 80){
    		result = "A";
    	}
		else if(55 <= d && d < 70){
			result = "P";
		}
		else if(40 <= d && d < 55){
			result = "D";
		}
		else{
			result = "T";
		}
    	
    	return result;
    }
	
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
