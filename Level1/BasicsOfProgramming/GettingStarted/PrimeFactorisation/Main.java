package BasicsOfProgramming.GettingStarted.PrimeFactorisation;

import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int number = scn.nextInt();
  for(int prime = 2 ; prime * prime <= number ; prime++){
      while(number%prime==0){
          number = number / prime;
          System.out.print(prime + " ");
      }
  }
  if(number!=1){
      System.out.print(number);
  }
 }
}