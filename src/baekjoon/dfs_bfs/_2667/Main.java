package baekjoon.dfs_bfs._2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 단지번호붙이기
 * https://www.acmicpc.net/problem/2667
 * @author big
 *
 */
class Solution {
	int N;
	int[][] arr;
	int[] addRowArr = {1, -1, 0, 0};
	int[] addColArr = {0, 0, 1, -1};
	List<Integer> resultList;
	int count = 0;

	public Solution(int size) {
		this.N = size;
		this.arr = new int[size][size];
		resultList = new ArrayList<Integer>();
	}

	public void add(int x, int y, int n) {
		this.arr[x][y] = n;
	}

	public Solution find() {
		for (int i = 0; i < this.N; i++) {
			for (int j = 0; j < this.N; j++) {

				if (arr[i][j] == 1) {
					count = 0;
					bfs(i, j);
					resultList.add(count);
				}
			}
		}
		
		return this;
	}

	void dfs(int x, int y) {
		arr[x][y] = 0;	// checked
		count++;

		// 연결 node 찾기
		for (int i = 0; i < 4; i++) {
			int addRow = x + addRowArr[i];
			int addCol = y + addColArr[i];

			// 배열을 벗어나지 않도록
			if (addRow < this.N && addCol < this.N
					&& addRow >= 0 && addCol >= 0) {
				if (arr[addRow][addCol] == 1) {
					dfs(addRow, addCol);
				}
			}
		}
	}
	
	void bfs(int x, int y) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(new Node(x, y));
		
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			x = node.getX();
			y = node.getY();
			
			arr[x][y] = 0;
			
			// 연결 node count
			count++;
			
			// 상하좌우 연결 node 찾기
			for (int i = 0; i < 4; i++) {
				int addRow = x + addRowArr[i];
				int addCol = y + addColArr[i];
				
				// 배열을 벗어나지 않도록
				if (addRow < this.N && addCol < this.N
						&& addRow >= 0 && addCol >= 0) {
					if (arr[addRow][addCol] == 1) {
						arr[addRow][addCol] = 0;
						queue.add(new Node(addRow, addCol));
					}
				}
			}
		}
	}

	void print() {
		Collections.sort(this.resultList);
		System.out.println(this.resultList.size());
		for (Integer n : this.resultList) {
			System.out.println(n);
		}
	}
}

class Node {
	
	private int x;
	private int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());

		Solution s = new Solution(size);

		for (int i = 0; i < size; i++) {
			String inputStr = br.readLine();
			for (int j = 0; j < size; j++) {
				s.add(i, j, Character.getNumericValue(inputStr.charAt(j)));
			}
		}

		s.find().print();
		
		br.close();
	}
}
