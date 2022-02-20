import java.io.*;
import java.util.*;

public class Main{
  

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }

      int ls[] = new int[n];
      int rs[] = new int[n];

      Stack<Integer> lst = new Stack<>();
      Stack<Integer> rst = new Stack<>();

      // left smallest
      ls[0] = -1;
      lst.push(0);
      for(int i = 1; i < n ; i++){
         while(lst.size()>0 && a[i]<=a[lst.peek()])
            lst.pop();
         if(lst.size()>0)
            ls[i] = lst.peek();
         else
            ls[i] = -1;
         lst.push(i);
      }

      // right smallest
      rs[n-1] = n;
      rst.push(n-1);
      for(int i = n-2; i >= 0; i--){
         while(rst.size()>0 && a[i]<=a[rst.peek()]) 
            rst.pop();
         if(rst.size()>0) 
            rs[i] = rst.peek();
         else 
            rs[i] = n;
         rst.push(i);
      }

      // logic of max area rectangle
      int max = Integer.MIN_VALUE;
      for(int i = 0 ; i < n; i++){
         int h = a[i];
         int b = rs[i] - ls[i] -1;
         int area = h*b;
         if(area>max)
            max = area;
      }
      System.out.println(max);
   }

}