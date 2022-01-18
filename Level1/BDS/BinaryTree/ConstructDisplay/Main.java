package BDS.BinaryTree.ConstructDisplay;
import java.util.*;
import java.util.Stack;

public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
    }
    public static class Pair{
        Node node;
        int state;
    }
    public static Node construct(Integer[] arr){
        Stack<Pair> stack = new Stack<>();
        Node root = new Node();
        root.data = arr[0];
        Pair rootp = new Pair();
        rootp.node = root;
        rootp.state = 1;
        stack.push(rootp);
        int idx = 1;
        while(stack.size()>0){

        }
        return null;
    }
    public static void display(Node node){}
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = construct(arr);
        display(root);
    }
}
