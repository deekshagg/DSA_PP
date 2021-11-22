package time_space_complexity.Merge_two_sorted_arrays;

import java.io.*;
import java.util.*;

public class Main {

  // you need to input 2 "sorted arrays"
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

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}