package Level1.BDS.BinaryTree.ConstructDisplay;

import java.util.Stack;

public class Main3{
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
        Stack<Pair> stack = new Stack<>();
        Node node = new Node(arr[0], null, null);
        Pair p = new Pair(node, 1);
        int idx = 1;
        stack.push(p);
        while(stack.size()>0){
            Pair pp = stack.peek();
            if(pp.state == 1){
                if(arr[idx] != null){
                    Node lc = new Node(arr[idx], null, null); 
                    pp.node.left = lc;
                    Pair lp = new Pair(lc, 1);
                    stack.push(lp);
                }
                pp.state++;
                idx++;
            }
            else if(pp.state == 2){
                if(arr[idx] != null){
                    Node rc = new Node(arr[idx], null, null); 
                    pp.node.right = rc;
                    Pair rp = new Pair(rc, 1);
                    stack.push(rp);
                }
                pp.state++;
                idx++;
            }
            else{
                stack.pop();
            }
        }
        return node;
    }

    public static void display(Node node) {
        if(node == null) return;
        String str = " <- " + node.data + " -> ";
        String lcstr = node.left != null? node.left.data + "" : ".";
        String rcstr = node.right != null? node.right.data + "" : ".";
        System.out.println(lcstr + str + rcstr);
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
