import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        int[] arr = makearray(n, m , matrix, s);
        rotate(arr, r);
        ringrotate(n,m,matrix,arr,s);
        display(matrix);
    }
    // array bnana hai shell s ka
    public static int[] makearray(int n , int m, int[][] matrix, int s){
        int sr = s-1, sc = s-1;
        int dr = n-s, dc= m-s;

        int lengthofarray = 2*(dr-sr+dc-sc);
        int[] arr = new int[lengthofarray];
        int index = 0;

        // left wall
        for(int c = sr ; c <= dr ; c++){
            arr[index] = matrix[c][sc];
            index++;
        }
        sc++;
        // bottom wall
        for(int r = sc ; r <= dc ; r++){
            arr[index] = matrix[dr][r];
            index++;
        }
        dr--;
        // right wall
        for(int c = dr ; c >= sr ; c--){
            arr[index] = matrix[c][dc];
            index++;
        }
        dc--;
        // top wall
        for(int r = dc ; r >= sc ; r--){
            arr[index] = matrix[sr][r];
            index++;
        }
        sr++;
        return arr;

    }
    // ab array ko rotate krna hai 
    // uske liye rotate function likhna padega
    public static void rotate(int[] arr, int r){
        r = r % arr.length;
        if(r<0){
            r = r + arr.length;
        }
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, r-1);
        reverse(arr, r, arr.length-1);
    }
    // rotate bnane k liye reverse bna
    public static void reverse(int[] arr, int left , int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    // ab rotation k baad matrix fill krni hai 
    // toh 
    public static void ringrotate(int n , int m, int[][] matrix, int[] arr, int s){
        int sr = s-1, sc = s-1;
        int dr = n-s, dc = m-s;
        int idx = 0;
        // left
        for(int i = sr ; i <= dr ; i++){
            matrix[i][sc] = arr[idx];
            idx++;
        }
        sc++;
        // bottom
        for(int j = sc ; j <= dc ; j++){
            matrix[dr][j] = arr[idx];
            idx++;
        }
        dr--;
        // right
        for(int i = dr ; i >= sr ; i--){
            matrix[i][dc] = arr[idx];
            idx++;
        }
        dc--;
        // top
        for(int j = dc ; j >= sc ; j--){
            matrix[sr][j] = arr[idx];
            idx++;
        }
        sr++;
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}