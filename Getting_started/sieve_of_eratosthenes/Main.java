package Getting_started.sieve_of_eratosthenes;

import java.util.Scanner;

// isme kya hai ki print all primes until n ki jo time complexity hai use km kra hai 
// normal code ki complexity hoti hai n root n aur isme 
// sieve of eratosthenes me ho jayegi n log log n
// space complexity bd jaye is allowed
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number youwant to print primes until ");
        int n = scn.nextInt();
        boolean[] arr = new boolean[n+1]; // is array m by defualt false pada hoga
        for (int i = 2 ; i*i < arr.length ; i++){
            if(arr[i]== false){
                for(int ja= i ; i*ja < arr.length ; ja++){
                    arr[i*ja] = true;
                }
            }
        }
        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i] == false){
                System.out.println(i); // jo jo false bache hai that means they are prime
            }
        }
    }
}
