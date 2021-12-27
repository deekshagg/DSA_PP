package ADS.HashMapsAndHeaps.getCommonElementII;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int n1 = scn.nextInt();
    int [] a1 = new int [n1];
    for(int i = 0; i<a1.length; i++){
        a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] a2 = new int [n2];
    for(int i = 0; i<a2.length; i++){
        a2[i] = scn.nextInt();
    }

    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int val1 : a1){
        if(hm.containsKey(val1)){
            int of = hm.get(val1);
            int nf = of + 1;
            hm.put(val1,nf);

        }   else{
            hm.put(val1,1);
        }

       
    }

    for(int val2 : a2){
        if(hm.containsKey(val2) && hm.get(val2)>0){
            System.out.println(val2);
            int of = hm.get(val2);
            int nf = of-1;
            hm.put(val2,nf);

        }
    }

 }

}
