package BasicsOfProgramming.GettingStarted.CountOfDigits;

import java.util.Scanner;

// import jdk.incubator.jpackage.internal.Log;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();
        int digit = 0;
        // while(number!=0){
        //     number = number /10;
        //     digit++;
        // }
        digit = (int)Math.log10(number) + 1;
        System.out.println(digit);
        scan.close();
    }
}

// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int count = (int) Math.log10(n) + 1;
// System.out.println(count);
