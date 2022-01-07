package DynamicProgramming.DynamicAndGreedy.countEncodings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextInt();

        int[] dp = new int[str.length()];
        dp[0] = 1;

        for(int i = 1 ; i < dp.length ; i++){
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0'){
                dp[i] = 0;
            }else if(str.charAt(i-1) == '0' && str.charAt(i) !=)
        }
    }
}
