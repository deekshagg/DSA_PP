package Mincostinmazelength;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] oarr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                oarr[i][j] = scn.nextInt();
            }
        }
        int mincost = mincostmazetraversal(n , m , oarr);
        System.out.println(mincost);
    }
    public static int mincostmazetraversal(int n , int m , int[][] oarr){
        int[][] dp = new int[n][m];
        
        for(int i = n-1 ; i >=0 ; i--){
            for(int j = m-1 ; j >=0 ; j--){
                if(i==n-1 && j==m-1){
                    dp[i][j] = oarr[i][j];
                }
                else if(i == n-1){
                    dp[i][j] = dp[i][j+1]+oarr[i][j]; 
                }
                else if(j == m-1){
                    dp[i][j] = dp[i+1][j] + oarr[i][j]; 
                }
                else{
                    dp[i][j] = Math.min(dp[i][j+1],dp[i+1][j]) + oarr[i][j];
                }
            }
        }
        return dp[0][0];
    }

}
