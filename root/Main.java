import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        // code goes here
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        // String r = "";
        // for(int i = 0 ; i < arr.length ; i++){
        // r = r + arr[i];
        // }
        String ans[] = str.split(" ");
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < ans.length; i++) {
            if (i == 0) {
                s.append(ans[i].toLowerCase());
            } else {
                s.append((ans[i].charAt(0) + "").toUpperCase() +
                        ans[i].substring(1).toLowerCase());
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
        s.close();
    }

}