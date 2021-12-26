package ADS.HashMapsAndHeaps.getCommonElementI;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1  = new int[n1];
    for(int index = 0 ; index<n1 ; index++){
        arr1[index] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int index2 = 0 ; index2<n2 ; index2++){
        arr2[index2] = scn.nextInt();
    }
    getcommon(n1,arr1,n2,arr2);
 }
 public static void getcommon(int n1, int arr1[], int n2, int arr2[]){
     HashMap<Integer, Integer> hm = new HashMap<>();
     for(int val: arr1){
         if(hm.containsKey(val)){
             int of = hm.get(val);
             int nf = of + 1;
             hm.put(val,nf);
         }
         else{
             hm.put(val,1);
         }
     }
     for(int val2 : arr2){
         if(hm.containsKey(val2)){
             System.out.println(val2);
             hm.remove(val2);
         }
     }
 }

}