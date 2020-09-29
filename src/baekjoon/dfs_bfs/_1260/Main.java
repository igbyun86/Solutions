package baekjoon.dfs_bfs._1260;

import java.io.*;
import java.util.*;

/**
 * 바이러스
 * https://www.acmicpc.net/problem/2606
 * @author big
 *
 */
public class Main {
	static ArrayList<Integer>[] list;
    static int count = 0;
    static boolean[] isVisited;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		isVisited = new boolean[n + 1];
		list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
            isVisited[i] = false;
        }
		
		for (int i = 0; i < m; i++) {
			String[] arr = br.readLine().split(" ");
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			list[num1].add(num2);
			list[num2].add(num1);
		}
		
		dfs(1);
		
		System.out.println(count - 1);
		
		br.close();
	}
	
	private static void dfs(int x) {
		isVisited[x] = true;
		count++;
		
		for (Integer num : list[x]) {
			if (!isVisited[num]) {
                dfs(num);
            }
		}
	}
}
