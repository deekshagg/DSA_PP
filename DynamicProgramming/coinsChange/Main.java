package DynamicProgramming.coinsChange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        int[] coins = {1,2,3,5};
        int t = coins.length;
        int[] dp = new int [n+1];
        Arrays.fill(dp, 0);
        System.out.println(minNumberOfCoinsForChange(n, coins, t, dp)); 
    }
    public static int minNumberOfCoinsForChange(int n, int coins[] , int t , int dp[]){
        for(int i = 1; i <= n ; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j =0 ; j<t ; j++){
                int c = coins[j];
                if(i-c>=0 && dp[i-c]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-c]+1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE? -1 : dp[n];
    }
}
