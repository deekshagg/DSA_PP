package BinaryTree.MaxElementsinaLevel;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Node{
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
	public static int height (Node root) throws java.lang.Exception
	{
		// your code goes here
		Queue<Node> que = new LinkedList();
		que.add(root);
		int ans = 0;
		while(que.size() >0 ){
		    int size = que.size();
		    ans = Math.max(ans, size);
		    while(size>0){
		        Node remove = que.remove();
		  
    		    if(root.left!=null){
    		        que.add(remove.left);
    		    }
    		    if(root.right!=null){
    		        que.add(remove.right);
    		    }
    		    size--;
		    }
		    
		}
		return ans;
	}
}
