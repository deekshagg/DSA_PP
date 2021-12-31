package findelementinarray;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++){
        arr[i] = scn.nextInt();
    }
    int n = scn.nextInt();
    findindex(size,arr,n);
 }
 public static void findindex(int size, int[] arr, int n){
     int ansindex = -1;
     for(int i = 0 ; i < size ; i++){
         if(arr[i]==n){
             ansindex = i;
         }
     }
     if(ansindex<size){
         System.out.println(ansindex);
     }
     else{
         System.out.println(ansindex);
     }
 }

}
