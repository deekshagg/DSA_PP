package isPrime;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many times you want to check");
        int testcase = scan.nextInt();
        System.out.println("enter a number to check it is prime or not");
        for(int i = 0 ; i<testcase ; i++){
            int number = scan.nextInt();
            boolean isPrime = true;
            int div = 2;
            while(div * div <= number) {
                int remainder = number%div;
                if(remainder==0){
                    isPrime = false;
                    break;
                }
                div++;
            }
            if(isPrime==true){
                System.out.println(number+" is prime;");
            }else{
                System.out.println(number+" is not prime;");
            }
        }
        scan.close();
    }
}
