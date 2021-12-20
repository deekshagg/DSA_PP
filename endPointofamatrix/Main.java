package endPointofamatrix;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        matrixendpoint(arr, n, m);
    }
    public static void matrixendpoint(int[][] arr, int n , int m ){
        int dir = 0 , i = 0 , j = 0 ; 
        while(true){
            dir = (dir+arr[i][j])%4;
            if(dir == 0){
                j++;
                if(j>=m){
                    j--;
                    break;
                }
            }
            else if(dir == 1){
                i++;
                if(i>=n){
                    i--;
                    break;
                }
            }
            else if(dir == 2){
                j--;
                if(j == -1){
                    j++;
                    break;
                }
            }
            else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(i + "\n" + j);
    }

}