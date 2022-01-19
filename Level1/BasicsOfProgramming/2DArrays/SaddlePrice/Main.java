import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        saddleprice(arr,n);
    }
    public static void saddleprice(int[][] arr , int n){
        int i = 0;
        while( i < n ){
            int min = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[i][j]<arr[i][min]){
                    min = j;
                }
            }
            boolean flag = true;
            for(int k = 0 ; k < n ; k++){
                if(arr[k][min]>arr[i][min]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i][min]);
                return;
            }
            i++;
        }
        System.out.println("Invalid input");

    }

}