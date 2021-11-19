package Getting_started.FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter how many elements you want in fibonacci series");
        int n = scn.nextInt();
        int a = 0;
        int b =1;
        for(int i = 0 ; i<n ; i++){
            int c = a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
        scn.close();
    }
}
