package ReverseNumber;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();
        while(number!=0){
            int rem = number%10;
            number = number /10;
            System.out.println(rem);
        }
        scan.close();
    }
}
