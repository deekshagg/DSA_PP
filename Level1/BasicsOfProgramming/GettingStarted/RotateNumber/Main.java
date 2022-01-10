package BasicsOfProgramming.GettingStarted.RotateNumber;

// public class Main {
//     public static void main(String[] args) {
//         int number = 95673;
//         int kpostision = 3;
//         System.out.println(reverse(number));
//     }
//     public static int reverse(int number){
//         int count = (int) Math.log10(number);
//         int div = (int) Math.pow(10, count);
//         int result = 0;
//         while(div>=1){
//             int remainder = number%10;
//             number=number/10;
//             result = result + remainder*div;
//             div = div /10;
//         }
//         return result;
//     }
//     public static int reverse(int number, int kpostision){
//         int result =0 ;

//         return result;
//     }
// }

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     rotateNum(n,k);
    }
    public static void rotateNum(int n , int k){
      
    //   count total digits
    int count = (int)Math.log10(n)+1;

    //optimizing k || make the rotating number k positive
    k = k % count;
    if(k<0){
        k = k + count;
    }

    // split the number to rotate
    int rotatemultiplier = (int)Math.pow(10,k);
    int fend = n/rotatemultiplier;
    int send = n%rotatemultiplier;

    // find the multiplier to rotate the number
    int femultiplier = (int)Math.pow(10,count - k);

    // find the rotated number
    int newnum = send*femultiplier + fend;

    // print the rotated number
    System.out.println(newnum);
      
    }
   }
