
/*
    x   o   o   o   x
    o   x   o   x   o
    o   o   x   o   o
    o   x   o   x   o
    x   o   s   o   x

Implement a method called parseInt(String) which takes String as input
and if it is a valid number, converts it to int type and returns it 
otherwise throws an exception.

 */
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int mult = 1;
        int ans = 0;

        for (int i = str.length() - 1; i >= 0 ; i--) {
            if (Character.isDigit(str.charAt(i))) {
                int n = str.charAt(i) - '0'; // '4' (48 + 4) - '0' (48) = 4
                n = n * mult; // 4 * 1 = 4
                mult = mult * 10;  // 1 * 10 = 10 
                ans += n;  // 4 
            }
            else {
                System.out.println("Enter a valid number string.");
                return;
            }

        }
        System.out.println(ans);
    }
}