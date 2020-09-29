package baekjoon.dfs_bfs._2606;

import java.io.*;
import java.util.*;

/**
 * DFS와 BFS
 * https://www.acmicpc.net/problem/1260
 * @author big
 *
 */
public class Main {
	static ArrayList<Integer>[] list;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strArr = br.readLine().split(" ");
    	
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        int start = Integer.parseInt(strArr[2]);

        list = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
        	String[] arr = br.readLine().split(" ");
            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);

            list[u].add(v);
            list[v].add(u);
        }

        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }

        isVisited = new boolean[n + 1];
        dfs(start);
        System.out.println();

        isVisited = new boolean[n + 1];
        bfs(start);
        System.out.println();

        br.close();
    }

    private static void dfs(int x) {
        if (isVisited[x]) {
            return;
        }

        isVisited[x] = true;
        System.out.print(x + " ");
        for (int y : list[x]) {
            if (!isVisited[y])
                dfs(y);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        isVisited[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int y : list[x]) {
                if (!isVisited[y]) {
                	isVisited[y] = true;
                    queue.add(y);
                }
            }
        }
    }
}
