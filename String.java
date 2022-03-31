import java.util.*;
// import java.lang.String;
public class String {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        java.lang.String str = scn.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int minF = Integer.MAX_VALUE;

        for(char ch : map.keySet()){
            if(map.get(ch)<minF) {
                minF = map.get(ch);
            }
        }
        java.lang.String result =  "";
        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            
        }
    }
}
