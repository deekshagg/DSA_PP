package BinaryTree.BinaryTreeADT;

import java.util.Scanner;

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

    //PreOrder BuildTree
    public static Node BuildTreePreorder(){
        
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        if(d==-1){
            scan.close();
            return null;
        }
        Node n= new Node(d);
        n.left = BuildTreePreorder();
        n.right = BuildTreePreorder();
        scan.close();
        return n;

    }

    // to print Binary Tree
    public static void printPreorderTree(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        printPreorderTree(root.left);
        printPreorderTree(root.right);

    }
    public static void main(String[] args) {
        Node root = BuildTreePreorder();
        printPreorderTree(root);
    }
}
