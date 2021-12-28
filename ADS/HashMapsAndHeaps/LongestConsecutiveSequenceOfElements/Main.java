package ADS.HashMapsAndHeaps.LongestConsecutiveSequenceOfElements;
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = scn.nextInt();
    }

    longestConsecutiveSequence(arr);
 }
 public static void longestConsecutiveSequence(int[] arr){
     HashMap<Integer, Boolean> map = new HashMap<>();
     for(int value : arr){
        map.put(value, true);
     }
     for(int value : arr){
         if(map.containsKey(value-1)){
             map.put(value, false);
         }
     }
     int maxSequenceStartInt = 0;
     int maxLength = 0;
     for(int value : arr){
         if(map.get(value) == true){
             int tempSeqStartInt = value;
             int tempLength = 1; 
             while(map.containsKey(tempSeqStartInt+tempLength)){
                 tempLength++;
             }
             if(tempLength > maxLength){
                 maxLength = tempLength;
                 maxSequenceStartInt = tempSeqStartInt;
             }
         }
     }
     for(int i = 0 ; i < maxLength ; i++){
         System.out.println(maxSequenceStartInt+i);
     }
 }

}