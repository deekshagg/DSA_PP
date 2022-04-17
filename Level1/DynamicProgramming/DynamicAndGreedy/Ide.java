/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = [3, 2, 4, 2, 0, 2, 3, 1, 2, 2];
		System.out.println(countJump(0, n , arr));
	}
	
	private static int kapsack01(int itemsValues[], int itemsWeights[], int capacity) {
	    int n = itemsWeights.length;
	    int dp[][] = new int[n + 1][capacity + 1];
	    for(int x = 1; x <= n; x++) {
	        for(int y = 1; y <= capacity; y++) {
	            
	            if(itemsWeights[x - 1] <= capacity) {
	                dp[x][y] = Math.max(dp[x - 1][y], dp[x - 1][y - itemsWeights[x -1]] + itemsValues[x - 1]);
	            } else {
	                dp[x][y] = dp[x - 1][y];
	            }
	        }
	    }
	    dp[n][capacity];
	}
	
	private static int coinChangeComb(int arr[], int target) {
	    int dp[] = new int[target+1];
	    dp[0] = 1;
	    for(int i = 0  ; i < arr.length ; i++) {
	        for(int j = 0 ; j < dp.length ; j++) {
	            if(j >= arr[i]){
	                int rem = j - arr[i];
	                dp[j] += dp[rem];
	            }
	        }
	    }
	    return dp[target];
	}
	
	private static int coinChangePerm(int arr[], int target) {
	    int dp[] = new int[target+1];
	    dp[0] = 1;
	    for(int j = 0 ; j < dp.length ; j++) {
	        for(int i = 0  ; i < arr.length ; i++) {
	            if(j >= arr[i]){
	                int rem = j - arr[i];
	                dp[j] += dp[rem];
	            }
	        }
	    }
	    return dp[target];
	}
	
	private static boolean targetSum(int arr[], int target) {
	    int n = arr.length;
	    boolean[][] dp = new boolean[n + 1][target + 1];
	    for(int x = 0; x <= n; x++) dp[x][0] = true;
	    for(int x = 1; x <= n; x++) {
	        for(int y = 1; y <= target; y++) {
	            dp[x][y] = dp[x - 1][y];
	            if(!dp[x][y] && y >= arr[x]) {
	                dp[x][y] = dp[x - 1][y -arr[x]];
	            }
	        }
	    }
	    return dp[n][target];
	}
	
	private static int targetSum(int arr[], int target) {
	    int dp[][] = new int[arr.length+1][target+1];
	    
	    for(int i = 1 ; i < dp.length ; i++) {
	        for(int j = 0 ; j < dp[0].length ; j++) {
	            if(j == 0) dp[i][j] = 1;
	            if(j > arr[i-1]) {
	                dp[i][j] += dp[i-1][j - arr[i-1]];
	            }else {
	                dp[i][j] += dp[i-1][j];
	            }
	        }
	    }
	    
	}
	
	private static int minCostPath(int x, int y, int arr[][], int memCost[][], string memPath[][]) {
	    if(x == arr.length - 1 && y == arr[0].length - 1) {
	        memPath[x][y] = "";
	        return arr[x][y];
	    }
	    if(memCost[x][y] != 0) return memCost[x][y];
	    if(x = arr.length - 1) {
	        memPath[x][y] = "H" + memPath[x][y + 1];
	        return minCostPath(x, y + 1, arr, memCost, memPath);
	    }
	    if(y = arr[0].length - 1) {
	        memPath[x][y] = "V" + memPath[x + 1][y];
	        return minCostPath(x + 1, y, arr, memCost, memPath);
	    }
	    
	    int option1 = minCostPath(x + 1, y, arr, memCost, memPath);
	    int option2 = minCostPath(x, y + 1, arr, memCost, memPath);
	    if(option1 < option2) {
	        memPath[x][y] = "R" + memPath[x + 1][y];
	    } else {
	        memPath[x][y] = "B" + memPath[x][y + 1];
	    }
	    memCost[x][y] = Math.min(option2, option1) + arr[x][y];
	    return memCost[x][y];
	}
	
	private static int minCostTraversal(int arr[][]) {
	    int dp[][] = new int[arr.length][arr[0].length];
	    for(int  i = dp.length - 1; i >=0 ; i--) {
	        for(int j = dp[0].length ; j >=0 ; j--) {
	            if( i == dp.length-1 && j == dp[0].length-1) {
	                dp[i][j] = arr[i][j];
	            }
	            if( i == dp.length-1){
	                dp[i][j] = dp[i][j+1] + arr[i][j];
	            }
	            else if( j == dp[0].length-1) {
	                dp[i][j] = dp[i+1][j] + arr[i][j];
	            }
	            else {
	                dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
	            }
	        }
	    }
	    return dp[0][0];
	}
	
	private static int countJump(int start, int n, int [] arr) {
	    int dp[] = new int[n+1];
	    dp[n] = 1;
	    for(int i = n-1 ; i >= 0 ;i++) {
	        if(arr[i]!=0) {
	            for(int j = 1; j <= arr[i] && i+j<n+1 ; j++) {
	                dp[i] = dp[i+j];
	            }
	        }
	    }
	    return dp[0];
	}
	
	private static int countJumpMem(int start, int n, int [] arr, int dp[]) {
	    
	    if(start == n) return 1;
	    if(dp[start]!=0) return dp[start];
	    for(int x = 1 ; x<=arr[start] && start+x <= n ; x++) {
	        dp[start] += countJump(start + x, n, arr);
	    }
	    return dp[start];
	}
	
	private static int minJump(int start, int n, int arr[]) {
	   // if(start >= n) return 0;
	    
	   // if(arr[start] == 0) return -1;
	    
	   // int min = -1;
	   // for(int x = 1; x < arr[start]; x++) {
	   //     int  option = minJump(start + x, n, arr);
	   //     if(option == -1) continue;
	   //     if(min == -1) min = option + 1;
	   //     min = Math.min(min, option + 1);
	   // }
	    
	   // return min;
	    
	    int[] mem = new int[n + 1];
	    
	    for(int x = n - 1; x >= 0; x--) {
	        int min = -1;
	        for(int i = 1; i <= arr[x] && x + i <= n; i++) {
	            int option = mem[x + i];
	            if(option == -1) continue;
	            if(min == -1) min = option + 1;
	            min = Math.min(min, option + 1);
	        }
	        mem[x] = min;
	    }
	    return mem[0];
	}
	
	private static int minJumpMem(int start, int n, int arr[], int mem[]) {
	    if(start >= n) return 0;
	    
	    if(arr[start] == 0) return -1;
	    if(mem[start] != 0) return mem[start];
	    int min = -1;
	    for(int x = 1; x <= arr[start]; x++) {
	        int  option = minJump(start + x, n, arr);
	        if(option == -1) continue;
	        if(min == -1) min = option + 1;
	        min = Math.min(min, option + 1);
	    }
	    mem[start] = min;
	    return min;
	}
	
	
	private static int countStair(int n, int jump) {
	   // if(n < 0) return 0;
	   // if(n <= 1) return 1;
	    
	   // int val = 0;
	   // for(int x = 1; x <= jump; x++) {
	   //     val += countJump(n - x, jump);
	   // }
	    
	   // return val;
	   int mem[] = new int[n + 1];
	   
	   countJumpMem(n, jump, mem);
	   
	}
	
	private static int countStairMem(int n, int jump, int[] mem) {
	    if(n < 0) return 0;
	    if(n <= 1) return 1;
	    
	    if(mem[n] != 0) return mem[n];
	    
	    int val = 0;
	    for(int x = 1; x <= jump; x++) {
	        val += countJump(n - x, jump);
	    }
	    
	    mem[n] = val;
	    return val;
	}
	
	
// 	0 1 1 2 3 5 8 13 21
	private static int fib(int n) {
	    
	   // if(n <= 1) return n;
	    
	   // return fib(n - 1) + fib(n - 2);
	   
	   int []mem = new int[n +1];
	   return fibMem(n, mem);
	   
	   mem[1] = 1
	   for(int x = 2; x <= n; x++) {
	       mem[x] = mem[x -1] + mem[ x - 2];
	   }
	   if(n <= 1) return n;
	   
	   int val1 = 0, val2 = 1;
	   for(int x = 2; x <= n; x++) {
	       int temp = val1 + val2;
	       val1 = val2;
	       val2 = temp;
	   }
	   return val2;
	}
	
	private static int fibMem(int n, int []mem) {
	    if(n <= 1) return n;
	    
	    if(mem[n] != 0) return mem[n];
	    
	    int val = fibMem(n - 1, mem) + fibMem(n - 2, mem);
	    mem[n] = val;
	    
	    return val;
	}
	
	
}
