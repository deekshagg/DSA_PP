package Level1.BDS.StacksAndQueues.CelebrityProblem;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
         for(int i = 0 ; i < arr.length ; i++) {
             stack.push(i);
         }
         while(stack.size() >= 2){
             int j = stack.pop();
             int i = stack.pop();
             if(arr[i][j] == 1) {
                 stack.push(j);
             }
             else{
                 stack.push(i);
             }
         }
         int ans = stack.pop();
         for(int i = 0 ; i < arr.length ; i++){
             if(i != ans) {
                 if(arr[i][ans] == 0 || arr[ans][i] == 1) {
                     System.out.println("none");
                     return;
                 }
             }
         }
         System.out.println(ans);
    }

}
