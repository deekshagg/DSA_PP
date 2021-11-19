package time_space_complexity.Target_sum_pair;

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
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]+arr[right] > target){
                right--;
            }
            else if(arr[left]+arr[right] < target){
                left++;
            }
            else{
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            }
        }
    }
}
