import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int numberofcoins = scn.nextInt();
        int[] coins = new int[numberofcoins];
        for(int amount = 0 ; amount < numberofcoins ; amount++ )
        {
            coins[amount] = scn.nextInt();
        }
        int target = scn.nextInt(); 
        coinchangepermuattions(numberofcoins,coins,target);
    }
    public static void coinchangepermuattions(int n , int[] arr, int tar){
        int dp[] = new int[tar+1];
        dp[0] = 1;
        for(int i = 1 ; i <=tar ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                int k = arr[j];
                if(k<=i)
                {
                    int r = i-k;
                    dp[i] += dp[r];
                }
            }
        }
        System.out.println(dp[tar]);


        // int dp[] = new int[target+1];
        // dp[0] = 1;
        // for(int amount = 1; amount<=target ; amount++){
        //     for(int coin : coins){
        //         if(coin<=amount){
        //             int reamount = amount - coin;
        //             dp[amount] += dp[reamount];
        //         }
        //     }
        // }
        // System.out.println(dp[target]);
    }
}
