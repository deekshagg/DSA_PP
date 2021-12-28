package ADS.HashMapsAndHeaps.getCommonElementII;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0 ; i < n1 ; i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i = 0 ; i < n2 ; i++){
        arr2[i] = scn.nextInt();
    }
     HashMap<Integer, Integer> fmap = new HashMap<>();
     for(int value : arr1){
         fmap.put(value, fmap.getOrDefault(value, 0) + 1);
     }
     for(int val2 : arr2){
         if(fmap.containsKey(val2) && fmap.get(val2)>0){
             System.out.println(val2);
             int of = fmap.get(val2);
             int nf = of - 1;
             fmap.put(val2, nf);
         }
     }

 }

}