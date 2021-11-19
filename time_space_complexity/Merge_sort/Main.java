package time_space_complexity.Merge_sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        print(merge_sort(arr, 0 , arr.length-1));
       
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
          System.out.print(arr[i] + " ");
        }
      }

    public static int[] merge_sort(int[] arr, int lo , int hi){
        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi)/2;
        int[] fsh = merge_sort(arr, lo, mid);
        int[] ssh= merge_sort(arr, mid+1, hi);
        int[] ans = mergeTwoSortedArrays(fsh, ssh) ;
        return ans;
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] answer = new int[a.length + b.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                answer[k] = a[i];
                i++;
                k++;
            }else{
                answer[k] = b[j];
                j++;
                k++;
            }
        }
        if(i == a.length){
            while( j < b.length){
                answer[k] = b[j];
                j++;
                k++;
            }
        }
        else if(j == b.length){
            while(i < a.length){
                answer[k] = a[i];
                i++;
                k++;
            }
        }
        
        return answer;
      }
    
}
