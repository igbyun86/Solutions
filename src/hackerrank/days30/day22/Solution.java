package hackerrank.days30.day22;

import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Solution {

	public static int getHeight(Node root){
		int height = 0;
		int left = 0;
		int right = 0;
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		while(rightNode != null){
			rightNode = rightNode.right;
			if(rightNode !=null){
				System.out.println(rightNode.data);
			}
			right++;
		}
		
		while(leftNode != null){
			leftNode = leftNode.right;
			if(leftNode !=null){
				System.out.println(leftNode.data);
			}
			left++;
		}
		
		//System.out.println(right);
		//System.out.println(left);
		
		if(right > left) height = right;
		else height = left;
		
		return height;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left,data);
                root.left=cur;
            }
            else{
                cur = insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        
        while(T-- > 0){
            int data = sc.nextInt();
            root = insert(root,data);
        }
        
        int height = getHeight(root);
        System.out.println(height);
    }
}
