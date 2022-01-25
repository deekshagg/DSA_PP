package Level1.BDS.GenericTrees.IterativePreorderAndPostorderOfGST;

import java.io.*;
import java.util.*;

public class Main {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static void preorder(Node node) {
        System.out.print(node.data + " ");
        for (Node child : node.children) {
            preorder(child);
        }
    }

    public static class Pair {
        int state;
        Node node;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void Iterative(Node root) {

        String PreOrder = "";
        String PostOrder = "";

        Stack<Pair> stack = new Stack<>();
        Pair pair = new Pair(root, -1);
        stack.push(pair);

        while(stack.size() > 0){
            Pair peek = stack.peek();
            if(peek.state == -1){
                PreOrder += peek.node.data + " ";
                peek.state++;
            }else if(peek.state >= 0 && peek.state<peek.node.children.size()){
                Pair child = new Pair(peek.node.children.get(peek.state),-1);
                stack.push(child);
                peek.state++;
            }else if(peek.state == peek.node.children.size()){
                PostOrder += peek.node.data + " ";
                peek.state++;
            }else{
                stack.pop();
            }
        }

        System.out.println(PreOrder + "\n" + PostOrder);


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        // int k = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        // display(root);
        // preorder(root);
        Iterative(root);
        // int kthLargest = kthLargest(root, k);
        // System.out.println(kthLargest);
    }

}