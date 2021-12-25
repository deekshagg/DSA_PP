package Getting_started.isPrime;
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

// import java.util.*;
  
//   public class Main{
  
//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int t = scn.nextInt();
//       for(int i = 0 ; i < t ; i++){
//         int n = scn.nextInt();
//         boolean prime = true;
//         for(int div = 2 ; div*div <= n ; div++){
//           int rem = n%div;
//           if(rem==0){
//             prime = false;
//             break;
//           }
//         }
//         if(prime==true){
//           System.out.println("prime");
//         }else{
//           System.out.println("not prime");
//         }
//       }

  
//    }
//   }
