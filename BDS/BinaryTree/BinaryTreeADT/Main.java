package BinaryTree.BinaryTreeADT;

import java.util.Scanner;
import java.util.Stack;
// import java.util.AbstractList;

public class Main {

    public static void display(Node n) {
        if(n == null) return;
        display(n.left);
        System.out.println(n.data);
        display(n.right);
    }
    
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data=d;
            left = null;
            right = null;
        }
    }

    //BuildTree

    // 4 5 2 -1 -1 1 -1 -1 7 -1 -1 
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

    // to print preorder Binary Tree
    // preorder root, left, right
    public static void printPreorderTreeRecursive(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        printPreorderTreeRecursive(root.left);
        printPreorderTreeRecursive(root.right);

    }

    // to print inorder Binary Tree
    // inorder root, left, right
    public static void printInorderTreeRecursive(Node root){
        if(root==null){
            return;
        }
        printInorderTreeRecursive(root.left);
        System.out.print(root.data + " ");
        printInorderTreeRecursive(root.right);

    }

    // to print postorder Binary Tree
    // postorder left, right, root
    public static void printPostorderTreeRecursive(Node root){
        if(root==null){
            return;
        }
        printPostorderTreeRecursive(root.left);
        printPostorderTreeRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public static void printPreorderTreeIterative(Node root){
        if(root==null){
            return;
        }
        Stack < Node > stack = new Stack<Node>();
        Node current = null;
        stack.push(root);
        while(stack.empty()==false){
            current = stack.peek();
            System.out.println(current.data + " ");
            stack.pop();
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }
    public static void main(String[] args) {
        Node root = BuildTree();
        // display(root);
        // printPreorderTreeRecursive(root);
        printPreorderTreeIterative(root);
        // printInorderTreeRecursive(root);
        // printPostorderTreeRecursive(root);
    }
}
