package Getting_started.FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter how many elements you want in fibonacci series");
        int n = scn.nextInt();

        // method 1 to print fibnoacci for a number
        // fibnacci of n 

        int fn = fib(n);
        System.out.println(fn);

        // method 2 to print in series

        // int a = 0;
        // int b =1;
        // for(int i = 0 ; i<n ; i++){
        //     int c = a+b;
        //     System.out.print(a+" ");
        //     a=b;
        //     b=c;
        // }
        scn.close();
    }
    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fib_n_minus_1 = fib(n-1);
        int fib_n_minus_2 = fib(n-2);
        int fn = fib_n_minus_1 + fib_n_minus_2;
        return fn;
    }
}
