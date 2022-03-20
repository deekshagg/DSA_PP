package Level1.BDS.StacksAndQueues.LargestAreaHistogram;

/* MY NEW CODE UPDATED*/

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
    
    // left smallest array
    int nsl[] = nsl(arr);
    // right smallest array
    int nsr[] = nsr(arr);

    System.out.println(largestAreaHisto(arr, nsl, nsr));
    
 }
    public static int largestAreaHisto(int[] arr, int[] nsl, int[] nsr) {
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            int tempArea = arr[i] * (nsr[i] - nsl[i] - 1);
            if(tempArea>maxArea) { maxArea = tempArea; }
        }
        return maxArea;
    }
    // next smallest right
    public static int[] nsr(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[arr.length];

        stack.push(0);
        for(int i = 1; i < arr.length ; i++){
            while ( stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                nsr[stack.pop()] = i;
            }
            stack.push(i);
        }
        while(stack.size()>0) {
            nsr[stack.pop()] = arr.length;
        }
        return nsr;
    }
    
    // next smallest left
    public static int[] nsl(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nsl = new int[arr.length];

        stack.push(0);
        nsl[0] = -1;
        for(int i = 1; i < arr.length ; i++){
            while ( stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.size() == 0)
            {
                nsl[i] = -1;
            }
            else 
            { 
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        return nsl;
    }
}

/*-------------------------------------------------------------------------------------*/

// import java.io.*;
// import java.util.*;

// public class Main{
  

//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//       int n = Integer.parseInt(br.readLine());
//       int[] a = new int[n];
//       for(int i = 0; i < n; i++){
//          a[i] = Integer.parseInt(br.readLine());
//       }

//       int ls[] = new int[n];
//       int rs[] = new int[n];

//       Stack<Integer> lst = new Stack<>();
//       Stack<Integer> rst = new Stack<>();

//       // left smallest
//       ls[0] = -1;
//       lst.push(0);
//       for(int i = 1; i < n ; i++){
//          while(lst.size()>0 && a[i]<=a[lst.peek()])
//             lst.pop();
//          if(lst.size()>0)
//             ls[i] = lst.peek();
//          else
//             ls[i] = -1;
//          lst.push(i);
//       }

//       // right smallest
//       rs[n-1] = n;
//       rst.push(n-1);
//       for(int i = n-2; i >= 0; i--){
//          while(rst.size()>0 && a[i]<=a[rst.peek()]) 
//             rst.pop();
//          if(rst.size()>0) 
//             rs[i] = rst.peek();
//          else 
//             rs[i] = n;
//          rst.push(i);
//       }

//       // logic of max area rectangle
//       int max = Integer.MIN_VALUE;
//       for(int i = 0 ; i < n; i++){
//          int h = a[i];
//          int b = rs[i] - ls[i] -1;
//          int area = h*b;
//          if(area>max)
//             max = area;
//       }
//       System.out.println(max);
//    }

// }