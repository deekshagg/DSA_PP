package Polynomial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two number n and x to solve in equation 1.x^n + ..... + n.x^1");
        
        int n = scn.nextInt();
        int x = scn.nextInt();
       
        int coeficient = n;
        int exponential = x;
        int answer = 0;
        while(coeficient>=1){
            int term = coeficient * exponential;
            answer = answer + term;
            coeficient--;
            exponential = exponential * x;
        }
        System.out.println("The answer is " + answer);
    }
}
