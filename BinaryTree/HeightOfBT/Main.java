package BinaryTree.HeightOfBT;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

    static Scanner scan = new Scanner(System.in);
    public static Node BuildTree(){
        
        int d = scan.nextInt();
        if(d==-1){
            // scan.close();
            return null;
        }
        Node n= new Node(d);
        n.left = BuildTree();
        n.right = BuildTree();
        // scan.close();
        
        return n;

    }
    public static void main(String[] args) {
        Node root = BuildTree();
        height(root);
    }

    static class Node{
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
	public static int height (Node root)
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
