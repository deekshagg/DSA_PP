package time_space_complexity.check_duplicate_in_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the array length");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr); //complexity = nlogn
        int duplicate = -1;
        for(int i = 0 ; i  < arr.length - 2 ; i++){ // complexity =  n 
            if(arr[i] == arr[i+1]){
                duplicate = arr[i];
                break;
            }
        }
        System.out.println("the duplicate in this array is "+duplicate); // total complexity = n + nlogn =  n logn (average)

    }
}
