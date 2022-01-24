package constructBST;

import java.util.*;
import java.util.Stack;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
    }

    public static Node construct(int[] arr, int low, int high){
        if(low>high){
            return null;
        }
        int mid = (low + high)/2;
        Node node = new Node();
        node.data = arr[mid];
        node.left = construct(arr, low, mid-1);
        node.right = construct(arr, mid+1, high);
        return node;
    }

    public static void display(Node node) {
        if(node == null){
            return;
        }
        String str = " <- " + node.data + " -> ";
        String lstr = node.left != null ? node.left.data + "" : ".";
        String rstr = node.right != null ? node.right.data + "" : ".";

        System.out.println(lstr + str + rstr);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 25, 37, 50, 62, 75, 87 };
        Node root = construct(arr, 0, arr.length-1);
        display(root);
    }
}
