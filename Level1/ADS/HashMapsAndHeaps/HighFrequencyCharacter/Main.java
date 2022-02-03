package ADS.HashMapsAndHeaps.HighFrequencyCharacter;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine(); // abbcd
        printHighFreqChar(str);
    }
    public static void printHighFreqChar(String str){
        HashMap<Character, Integer> hashmap = new HashMap<>();
        // a    1
        // b    2
        // c    1
        // d    1
        for(int i = 0 ; i < str.length() ; i++){//0 1 2 3 4
            char ch = str.charAt(i); //a    b   b    c   d
            if(hashmap.containsKey(ch)){   // ->no  yes
                int oldF = hashmap.get(ch); //1
                int newF = oldF + 1;//2
                hashmap.put(ch, newF);//->b[2]
            }
            else{
                hashmap.put(ch, 1);   // -> a[1]    ->b[2]  ->c[1]  ->d[1]
            }
        }
        for(int i =0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        char maxfchar = str.charAt(0);//a   
        for(Character key : hashmap.keySet()){//a   b   c   d
            if(hashmap.get(key)>hashmap.get(maxfchar)){// 1>1   2>1     1>2
                maxfchar = key; // a-> b 
            }
        }
        System.out.println(maxfchar); //b

    }

}
