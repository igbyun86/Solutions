package hackerrank.problem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	String result = "";
    	
    	if(s.length() > 0 && s.length() == 10){
    		String type = s.substring(s.length()-2, s.length());
    		type = type.toLowerCase();
    		
    		int hh = 0;
    		int mm = 0;
    		int ss = 0;
    		
    		// hh
    		hh = Integer.parseInt(s.substring(0, 2));
    		
    		// mm
    		mm = Integer.parseInt(s.substring(3, 5));
    		
    		// ss
    		ss = Integer.parseInt(s.substring(6, 8));
    		
    		if(1 > hh && hh > 12) return "";
    		if(0 > mm && mm > 59) return "";
    		if(0 > ss && ss > 59) return "";
    				
    		if("pm".equals(type)){
    			if(hh < 12){
    				hh = hh + 12;
    			}
    		}
    		else if("am".equals(type)){
    			if(hh == 12) hh = 0;
    		}
    		else return "";
    		
    		result = String.format("%02d:%02d:%02d", hh, mm, ss);
    	}
    	
    	return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
    
}
