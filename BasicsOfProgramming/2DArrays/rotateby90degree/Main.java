import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int m = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        rotateby90(n,arr);
        display(arr);
    }

    public static void rotateby90(int n, int[][] arr){
        // transpose liya phele
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // now i'll reverse the row arrays
        for(int k = 0 ; k<n ; k++){ 
            int left = 0;
            int right = n-1;   
            while(left<right){
                int temp = arr[k][left];
                arr[k][left] = arr[k][right];
                arr[k][right] =  temp;
                left++;
                right--;
            }
        }
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