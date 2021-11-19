package time_space_complexity.target_sum_triplet;

import java.util.Arrays;
import java.util.Scanner;
// 25 11 1 9 4 6 8 3 12 14 24 10 15
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int n = scan.nextInt();
        int [] arr = new int [n];
        for(int i=0 ; i  < n ; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            int ntar = target - arr[i];
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                if(arr[j] + arr[k] > ntar){
                    k--;
                }else if(arr[j] + arr[k] < ntar){
                    j++;
                }else{
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                }
            }
        }
    }
}
