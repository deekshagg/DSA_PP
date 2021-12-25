package TheStateofWakanda1;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            arr[i][j] = scn.nextInt();
        }
    } 
    for(int k = 0 ; k < m ; k++){
        if(k%2==0){
            for(int l = 0 ; l < n ; l++){
                System.out.println(arr[l][k]);
            }
        }else{
            for(int o = n-1 ; o>= 0 ; o--){
                System.out.println(arr[o][k]);
            }
        }
    }
 }

}
