package climbStairs;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int count = countclimbstairs(n);
        int count = countclimbstairsmemo(n,new int[n+1]);
        System.out.println(count);
    }

    // tabulation method (iterative method/ use less memory )
    public static int countclimbstairs(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1 ; i <= n ; i++){
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }

    // memoization (recursive)
    public static int countclimbstairsmemo(int n,int[] qb){
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int fnm1 = countclimbstairsmemo(n-1,qb);

        int fnm2 = countclimbstairsmemo(n-2,qb);

        int fnm3 = countclimbstairsmemo(n-3,qb);

        int ans = fnm1+fnm2+fnm3;
        qb[n] = ans;
        return qb[n];
    }


}
