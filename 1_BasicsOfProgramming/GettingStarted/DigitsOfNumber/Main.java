package Getting_started.DigitsOfNumber;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter a number");
//         int number = scan.nextInt();
//         // 345621
//         int temp = number;
//         int divisor = 1;
//         while(temp>10){
//             temp = temp /10;
//             divisor *= 10;
//         }
//         while(divisor>=1){
//             int q = number / divisor;
//             number = number % divisor;
//             System.out.println(q);
//             divisor/=10;
//         }
//         scan.close();
//     }   
// }


// // 34512
// // 54321

// // 34512
// // 54321


import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = (int) Math.log10(n) + 1;
        digits(n,count);  
     }
     public static void digits(int n, int count){
        //  int temp = n;
         int power = (int)Math.pow(10, count-1);
         int ans = 0;
         while(power>=1){
            ans = n/ power;
            n = n%power;
            System.out.println(ans);
            power/=10;
         }
     }
    }