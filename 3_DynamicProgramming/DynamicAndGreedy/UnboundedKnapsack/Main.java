import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int vals[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            vals[i] = scn.nextInt();
        }
        int weights[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            weights[i] = scn.nextInt();
        }
        int bagCapacity = scn.nextInt();
        maxValueCapacity(n,vals,weights,bagCapacity);
    }
    public static void maxValueCapacity(int n , int[] vals, int[] weights, int bagCapacity){
        int dp[] = new int[bagCapacity+1];
        dp[0] = 0;
        for(int bcap = 1 ; bcap <= bagCapacity ; bcap++){
            int max = 0;
            for(int wght = 0 ; wght < weights.length ; wght++){
                if(weights[wght]<=bcap){
                    int rcap = bcap - weights[wght];
                    int rval = dp[rcap];
                    int totalwght = rval + vals[wght];
                    if(totalwght>max){
                        max = totalwght;
                    }
                }
                dp[bcap] = max;
            }
        }
        System.out.println(dp[bagCapacity]);
    }
    // public static void maxValueCapacity(int n , int[] vals, int[] weights, int bagCapacity){
    //     int dp[] = new int[bagCapacity+1];
    //     dp[0] = 0;
    //     for(int c= 1 ; c <= bagCapacity ; c++){

    //         int max = 0;
    //         for(int j = 0 ; j < n ; j++){
                
    //             if(weights[j]<=c){
    //                 int rcap = c - weights[j];
    //                 int rval = dp[rcap];
    //                 int totalwght = rval + vals[j];
    //                 if(totalwght>max){
    //                     max = totalwght;
    //                 }
    //             }
    //             dp[c] = max;
    //         }
    //     }
    //     System.out.println(dp[bagCapacity]);
    // }
}