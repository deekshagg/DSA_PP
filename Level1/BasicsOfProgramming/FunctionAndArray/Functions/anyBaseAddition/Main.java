package BasicsOfProgramming.FunctionAndArray.Functions.anyBaseAddition;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int c = 0;
        int ans = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;

            if (d >= b) {
                d = d % b;
                c = 1;
            } else {
                c = 0;
            }

            ans = ans + (d * p);
            p = p * 10;
        }
        return ans;
    }
}
