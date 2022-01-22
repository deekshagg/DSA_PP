package Level1.BDS.GenericTrees.SecondLargest;
// input
// 24
// 10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1

import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static class SlargestMover{
      int largest = Integer.MIN_VALUE;
      int slargest = Integer.MIN_VALUE;
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
  static int largest = Integer.MIN_VALUE;
  static int slargest = Integer.MIN_VALUE;
  public static void slargest(Node node){
      if(node.data>largest){
          slargest = largest;
          largest = node.data;
      }
      else if(node.data > slargest){
          slargest= node.data;
      }
      for(Node child: node.children){
          slargest(child);
      }
  }
  public static void slargest2(Node node, SlargestMover mover){
    if(node.data>mover.largest){
        mover.slargest = mover.largest;
        mover.largest = node.data;
    }
    else if(node.data > mover.slargest){
        mover.slargest= node.data;
    }
    for(Node child: node.children){
        slargest2 (child, mover);
    }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);

    slargest(root);
    System.out.println("static Largest = " + largest);
    System.out.println("static Second Largest " + slargest);

    SlargestMover mover = new SlargestMover();
    slargest2(root, mover);
    System.out.println("Largest = " + mover.largest);
    System.out.println("Second Largest = " + mover.slargest);
  }

}
