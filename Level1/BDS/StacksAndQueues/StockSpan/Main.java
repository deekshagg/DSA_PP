package Level1.BDS.StacksAndQueues.StockSpan;
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int n = arr.length;
   int[] span = new int[n];
   Stack<Integer> stack = new Stack<>();
   span[0] = 1;
   stack.push(0);
   for(int i = 1 ; i < n ; i++){
     while(stack.size()>0 && arr[i]>arr[stack.peek()]){
       stack.pop();
     }
     if(stack.size()==0) span[i] = i+1;
     else span[i] = i-stack.peek();
     stack.push(i);
   }
   return span;
 }

}