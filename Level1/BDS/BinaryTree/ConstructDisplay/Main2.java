package BDS.BinaryTree.ConstructDisplay;

import java.util.Stack;

public class Main2 {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right  = right; 
        }
    }

    public static class Pair {
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rootp = new Pair(root, 1);
        Stack<Pair> stack = new Stack<>();
        stack.push(rootp);
        int idx = 1;

        while(stack.size()>0){
            Pair tp = stack.peek();
            if(tp.state == 1){
                if(arr[idx] != null){
                    Node lc = new Node(arr[idx], null, null);
                    Pair lp = new Pair(lc, 1);
                    tp.node.left = lc;
                    stack.push(lp);
                }
                tp.state++;
                idx++;
            }
            else if(tp.state == 2){
                if(arr[idx] != null){
                    Node rc = new Node(arr[idx], null, null);
                    Pair rp = new Pair(rc, 1);
                    tp.node.right = rc;
                    stack.push(rp);
                }
                tp.state++;
                idx++;
            }
            else{
                stack.pop();
            }
        }
        return root;
    }

    public static void display(Node node) {
        if(node == null){
            return;
        }
        String str = "";
        str += node.left == null?".":node.left.data + " ";
        str += " <- " + node.data + " -> "; 
        str += node.right == null?".":node.right.data + " ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null,
                87, null, null };
        Node root = construct(arr);
        display(root);
    }
}
