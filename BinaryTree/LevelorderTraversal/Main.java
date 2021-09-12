package BinaryTree.LevelorderTraversal;

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
		if(root == null){
		    return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		int max = Math.max(left, right);
		return max+1;
		
	}
}
