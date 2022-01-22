package Level1.BDS.GenericTrees.CeilandFloor;

// input
// 24
// 10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
// 65
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

  // through static
  // ceil and floor 1
  static int ceil = Integer.MAX_VALUE; // because it is a min(of the larger element)
  static int floor = Integer.MIN_VALUE; // because it is a max(of the smaller elements)

  public static void ceilAndFloor1(Node node, int data) {
    if (node.data > data) {
      // valid for ceil
      if (node.data < ceil) {
        ceil = node.data;
      }
    }
    if (node.data < data) {
      // relevant for floor
      if (node.data > floor) {
        floor = node.data;
      }
    }
    for (Node child : node.children) {
      ceilAndFloor1(child, data);
    }
  }

  // thorugh mover class
  public static class Mover {
    int ceil = Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;
  }
  // declare mover class
  // ceil and floor 2

  public static void ceilAndFloor2(Node node, int data, Mover mover) {
    if (node.data > data) {
      // valid for ceil
      if (node.data < mover.ceil) {
        mover.ceil = node.data;
      }
    }
    if (node.data < data) {
      // relevant for floor
      if (node.data > mover.floor) {
        mover.floor = node.data;
      }
    }
    for (Node child : node.children) {
      ceilAndFloor2(child, data, mover);
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
    int data = Integer.parseInt(br.readLine());
    Node root = construct(arr);

    // static
    ceilAndFloor1(root, data);
    System.out.println("static Ceil -> " + ceil + ", static Floor -> " + floor);

    // through mover
    Mover mover = new Mover();
    ceilAndFloor2(root, data, mover);
    System.out.println("Mover Ceil -> " + mover.ceil + ", Mover Floor -> " + mover.floor);
  }
}
