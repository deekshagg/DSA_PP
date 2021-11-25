package recursion.Inrtoduction.power_logarithmic;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int powerLog = power(x , n);
        System.out.println(powerLog);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int answer = power(x , n/2) * power(x,n/2); 

        if(n%2==1){
            answer = answer * x;
        }
        return answer;
    }

}
