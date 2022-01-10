package BasicsOfProgramming.GettingStarted.MaxMin2;

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      int arr[] = new int[num];
      for(int i = 0 ; i < num ; i++){
          arr[i] = scn.nextInt();
      }
      Arrays.sort(arr);
      System.out.println( arr[num-2] + " " + arr[1] );
  }
}

