package BinaryTree.BinaryTreeADT;

import java.util.Scanner;
import java.util.Stack;
import java.util.AbstractList;

public class Main {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data=d;
            left=right=null;
        }
    }

    //BuildTree
    public static Node BuildTree(){
        
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        if(d==-1){
            scan.close();
            return null;
        }
        Node n= new Node(d);
        n.left = BuildTree();
        n.right = BuildTree();
        scan.close();
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
        stack.push(this.root);
        while(stack.empty()==false){
            current = stack.top();
            System.out.println(current.data + " ");
            stack.pop();
            if(current.right){
                stack.push(current.right);
            }
            if(current.left){
                stack.push(current.left);
            }
        }


    }
    public static void main(String[] args) {
        Node root = BuildTree();
        printPreorderTreeRecursive(root);
        printInorderTreeRecursive(root);
        printPostorderTreeRecursive(root);
    }
}
