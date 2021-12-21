package spanofarray;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int[] arr = new int[size];
    // dekha bhul gyi scan
    for(int i = 0 ; i < size ; i++){
        arr[i] = scn.nextInt();
    }
    findspan(size,arr);
 }
 public static void findspan(int size, int []arr){
     int max = size - 1;
     int min = 0;
     for(int i = 0 ; i < size ; i++){
         if(arr[i] > arr[max]){
             max = i;
         }
         else if(arr[i] < arr[min]){
             min = i;
         }
     }
    //  check krri hu max ko
    // index pr
    //  System.out.println(arr[max]);
    //  System.out.println(arr[min]);
     int span = arr[max] - arr[min];
     System.out.println(span);
 }

}
