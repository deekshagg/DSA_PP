package ADS.HashMapsAndHeaps.HASHMAPS;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = {"apple", "bna", "apple", "dog"};
        for(int i = 0 ; i < arr.length ; i++){
            String s = arr[i];
            map.put(s, map.getOrDefault(s, 0)+1);
        }

    }
    // HashMap
    // put() == insert, update map.put(left, right)
    // get(key) == value(right side)
    // containsKey(key) ==  boolean
    // keySet() == set 
    // remove(key) == deletes the key
}
