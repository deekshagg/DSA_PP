import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j  = 0 ; j < n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int element = scn.nextInt();
        searchSortedArray(arr, n, element);
    }
    public static void searchSortedArray(int[][] arr, int n, int element){
        int i = 0;
        int j = arr.length -1;
        while(i<arr.length && j>=0){
            if(element==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(element<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }

}
