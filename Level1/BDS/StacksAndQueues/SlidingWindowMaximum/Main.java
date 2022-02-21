package Level1.BDS.StacksAndQueues.SlidingWindowMaximum;

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    int nge[] = new int[n];
    Stack<Integer> stack = new Stack<>();
    nge[n-1] = n;
    stack.push(n-1);
    for(int i = n-2 ; i >= 0 ; i--){
       while(stack.size()>0 && arr[i]>=arr[stack.peek()])
          stack.pop();
       if(stack.size()>0)
          nge[i] = stack.peek();
       else
          nge[i] = n;
       stack.push(i);
    }

    int ans[] = new int[n-k+1];
    int j = 0;

    for(int i = 0 ; i <= n-k ; i++){
       if(j<i)
          j=i;
       while(nge[j]<i+k)
          j = nge[j];
       ans[i] = arr[j];
    }

    for(int i : ans){
       System.out.println(i + " ");
    }
 }
}