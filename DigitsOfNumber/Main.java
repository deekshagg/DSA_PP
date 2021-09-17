package DigitsOfNumber;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();
        // 345621
        int temp = number;
        int divisor = 1;
        while(temp>10){
            temp = temp /10;
            divisor *= 10;
        }
        while(divisor>=1){
            int q = number / divisor;
            number = number % divisor;
            System.out.println(q);
            divisor/=10;
        }
        scan.close();
    }   
}


// 34512
// 54321

// 34512
// 54321
