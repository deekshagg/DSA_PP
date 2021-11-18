package rearrangeNegatives;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scan.nextInt();
        }
        for(int i =0 ; i< n-1 ; i++){
            int left = i;
            int leftie = arr[i];
           for(int j = i+1 ; j<n ; j++){
               if(arr[j]<leftie){
                   left = j;
                   leftie = arr[j];
               }
           }
           if(left!=i){
               arr[left] = arr[i];
               arr[i] = leftie;
           }
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
