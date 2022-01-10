package BinaryTree.MaxElementsinaLevel;
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static Scanner scan = new Scanner(System.in);
    public static Node BuildTree(){
        
        int d = scan.nextInt();
        if(d==-1) return null;
        Node n= new Node(d);
        n.left = BuildTree();
        n.right = BuildTree();
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
		Queue<Node> que = new LinkedList<Node>();
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
