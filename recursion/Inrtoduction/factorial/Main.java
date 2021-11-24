package recursion.Inrtoduction.factorial;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        
        int answerSoFar = factorial(n-1);
        answerSoFar = answerSoFar * n;
        
        return answerSoFar;
    }

}
