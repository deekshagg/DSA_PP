import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] a = new int[n];
    for(int i =0; i <a.length ; i++){
        a[i]=scn.nextInt();
    }

    HashMap <Integer,Boolean> hm = new HashMap<>();
    for(int val : a){
        hm.put(val,true);
    }

    for(int val : a){
        if(hm.containsKey(val-1)){
            hm.put(val,false);
        }
    }
    int msp =0; 
    int ml = 0;

    for(int val : a){
        if(hm.get(val)==true){
            int tl = 1;
            int tsp = val;
            while(hm.containsKey(tl+tsp)){
                tl++;
            }

            if(tl>ml){
                msp = tsp;
                ml = tl;
            }
        }
    }
    for(int i = 0; i<ml ; i++){
        System.out.println(msp+i);
    }

 }

}