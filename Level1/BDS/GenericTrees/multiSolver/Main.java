package Level1.BDS.GenericTrees.multiSolver;
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
  public static class HeapMover{
      int sum = 0;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int height = -1;
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

  static int sum = 0;
  static int max = Integer.MIN_VALUE;
  static int min = Integer.MAX_VALUE;
  static int height = -1;
  public static void multiSolver(Node node, int depth){
      sum += node.data;
      if(node.data>max){
          max = node.data;
      }
      if(node.data < min){
          min = node.data;
      }
      if(depth> height){
          height = depth;
      }
      for(Node child : node.children){
          multiSolver(child, depth+1);
      }
  }

  public static void multiSolver2(Node node , int depth , HeapMover mover){
      mover.sum += node.data;
      if(node.data>mover.max){
        mover.max = node.data;
      }
      if(node.data<mover.min){
          mover.min = node.data;
      }
      if(depth>mover.height){
          mover.height = depth;
      }
      for(Node child : node.children){
          multiSolver2(child, depth+1, mover);
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
    multiSolver(root, 0);
    System.out.println("Sum = " + sum);
    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    System.out.println("Height = " + height);
    HeapMover mover = new HeapMover();
    multiSolver2(root, 0, mover);
    System.out.println("Sum = " + mover.sum);
    System.out.println("Max = " + mover.max);
    System.out.println("Min = " + mover.min);
    System.out.println("Height = " + mover.height);
  }

}
