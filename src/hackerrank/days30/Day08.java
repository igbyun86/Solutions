package hackerrank.days30;

import java.util.*;
import java.io.*;

public class Day08 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Map<String, Object> map = new HashMap<String, Object>();
		
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            
            if(map.get(s) != null){
            	System.out.println(String.format("%s=%s",s, map.get(s)));
            }
            else{
            	System.out.println("Not found");
            }
        }
        
        in.close();
	}
}
