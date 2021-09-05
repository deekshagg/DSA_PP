package CountOfDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();
        int digit = 0;
        while(number!=0){
            number = number /10;
            digit++;
        }
        System.out.println(digit);
        scan.close();
    }
}
