package time_space_complexity.Target_sum_pair_with_binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        // binary search the compliment
        for(int i=0 ; i<n ; i++){
            int theOtherNumber = target - arr[i];
            if(theOtherNumber<arr[i]){
                break;
            }
            // binary search the target
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(theOtherNumber<arr[mid]){
                    right = mid -1;
                }
                else if(theOtherNumber>arr[mid]){
                    left = mid + 1;
                }
                else{
                    System.out.println(arr[i] + " " + arr[mid]);
                    break;
                }
            }
        }
    }
}

