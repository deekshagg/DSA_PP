package PrintAllPrimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the range in which you want to print prime");
        int low = scan.nextInt();
        int high = scan.nextInt();
        for(int n = low ; n<high ; n++){
            Boolean isPrime = true;
            for(int div = 2 ; div * div <= n ; div++){
                int rem = n % div;
                if (rem==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(n);
            }
        }
        scan.close();
    }
}
