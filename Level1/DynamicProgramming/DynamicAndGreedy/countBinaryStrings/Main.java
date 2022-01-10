package 3_DynamicProgramming.DynamicAndGreedy.countBinaryStrings;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // countBinaryStrings(n);
    countBinaryStringsArray(n);
 }
 public static void countBinaryStrings(int n){
    int old0s = 1;
    int old1s = 1;
    for(int i = 2 ; i <= n ; i++){
        int new0s = old1s;
        int new1s = old0s + old1s;

        old0s = new0s;
        old1s = new1s;
    }
    System.out.println(old0s+old1s);
 }
 public static void countBinaryStringsArray(int n){
     int dp0s[] = new int[n];
     dp0s[0] = 1;
     int dp1s[] = new int[n];
     dp1s[0] = 1;
     for(int i = 1 ; i < n ; i++){
         dp0s[i] = dp1s[i-1];
         dp1s[i] = dp0s[i-1] + dp1s[i-1];
     }
     System.out.println(dp0s[n-1]+dp1s[n-1]);

 }

}