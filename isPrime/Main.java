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
            int divisor = 2;
            while(divisor * divisor <= number) {
                int remainder = number%divisor;
                if(remainder==0){
                    isPrime = false;
                    break;
                }
                divisor++;
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
