package Level1.BDS.StacksAndQueues.NextGreaterElementToTheRight;

import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
  }

  // Approach 1 -> Right to Left O(n)
  // stack m element dalte hai
  public static int[] solve(int[] arr) {
    // solve
    int n = arr.length;
    int[] ans = new int[n];
    ans[n - 1] = -1;
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[n - 1]);
    for (int i = n - 2; i >= 0; i--) {
      while (stack.size() > 0 && stack.peek() < arr[i]) {
        stack.pop();
      }
      if (stack.size() == 0)
        ans[i] = -1;
      else
        ans[i] = stack.peek();
      stack.push(arr[i]);
    }
    return ans;
  }

  // Approach 2 left to right and we push the element index
  // o(n)
  public static int[] solve2(int[] arr) {
    int ans[] = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    for (int i = 1; i < arr.length; i++) {
      while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
        int pidx = stack.pop();
        ans[pidx] = arr[i];
      }
      stack.push(i);
    }
    while (stack.size() > 0) {
      int pidx = stack.pop();
      ans[pidx] = -1;
    }
    return ans;
  }

}