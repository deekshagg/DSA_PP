package 3_DynamicProgramming.DynamicAndGreedy.arrangeBuilding;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    arrangeBuildings(n);
 }
 public static void arrangeBuildings(int n){
     long oldbuilding = 1;
     long oldspace = 1;
     for(int i = 2 ; i <= n ; i++){
         long nbuilding = oldspace;
         long nspace = oldspace+oldbuilding;

         oldbuilding = nbuilding;
         oldspace = nspace;
     }
     long total = oldspace + oldbuilding;
     total = total*total;
     System.out.println(total);
 }

}
