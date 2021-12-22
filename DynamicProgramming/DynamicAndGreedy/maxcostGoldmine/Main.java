package maxcostGoldmine;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][]  arr= new int[r][c];
           for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }

        }

        int mines=GoldMines(r,c,arr);
        System.out.println(mines);

    }
    public static int GoldMines(int r,int c,int[][]arr){
        int[][] dp = new int[r][c];
        for(int j=dp[0].length-1; j>=0; j--){
            for(int i=dp.length-1;i>=0;i--){
                if(j==dp[0].length-1){
                    dp[i][j]=arr[i][j];

                }else if(i==0){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);

                }else if(i==arr.length-1){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);


                }else{
                    dp[i][j]=arr[i][j]+Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));

                }

            }
        }

        int max=dp[0][0];
        for(int i=1;i<dp.length;i++){
            max = Math.max(max,dp[i][0]);
        }

        return max;

    }
}
