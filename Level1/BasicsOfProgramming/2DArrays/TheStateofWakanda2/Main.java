import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        diagonals(arr, n);
    }
    public static void diagonals(int[][] arr, int n){
        for(int gap = 0 ; gap < n ; gap++){
            for(int i = 0, j = gap ; j < n ; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
