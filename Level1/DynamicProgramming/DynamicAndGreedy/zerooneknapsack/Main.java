package Level1.DynamicProgramming.DynamicAndGreedy.zerooneknapsack;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for( int i = 0 ; i < n ;i++ ) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        coinpermute(arr, n, target);
    }

    public static void coinpermute(int arr[] , int n, int tar) {
        int dp[] = new int[tar+1];
        dp[0] = 1;
        for(int j = 1; j < dp.length ; j++) {
            for(int i = 0 ; i < arr.length ; i++) {
                if(j >= arr[i]) {
                    dp[j] += dp[j - arr[i]];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}