package BasicsOfProgramming.GettingStarted.DigitFrequency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        System.out.println("enter which digit you wanna count");
        int d = scan.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(n+ " has " + d + ", " + f + " times" );
    }
    public static int getDigitFrequency(int num, int dig){
        int freq = 0;
        while(num>0){
            int rem = num % 10;
            if(rem == dig){
                freq++;
            }
            num = num/10;
        }
        return freq;
    }
}
