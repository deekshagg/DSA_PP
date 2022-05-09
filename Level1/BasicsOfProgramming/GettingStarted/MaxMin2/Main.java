package BasicsOfProgramming.GettingStarted.MaxMin2;

// import java.io.*;
// import java.util.*;

// public class Main {

//   public static void main(String[] args) throws Exception {
//       Scanner scn = new Scanner(System.in);
//       int num = scn.nextInt();
//       int arr[] = new int[num];
//       for(int i = 0 ; i < num ; i++){
//           arr[i] = scn.nextInt();
//       }
//       Arrays.sort(arr);
//       System.out.println( arr[num-2] + " " + arr[1] );
//   }
// }

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[]= new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
      }
      int max = arr[0];
      int min = arr[0];

      for(int i = 0; i < n; i++) {
        if(arr[i] < min) min = arr[i];
        if(arr[i] > max) max = arr[i];
      }
      int max2 = arr[0];
      int min2 = arr[0];

      for(int i = 0; i < n; i++) {
        if(arr[i] < min2 && arr[i] > min) min2 = arr[i];
        if(arr[i] > max2 && arr[i] < max) max2 = arr[i];
      }
      
      System.out.println(max2 + " " + min2);
  }
}
 