package MatrixMultiplication;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // input first matrix
    Scanner scn = new Scanner(System.in);
    int row1 = scn.nextInt();
    int col1 = scn.nextInt();
    int[][] one = new int[row1][col1];

    for(int i = 0 ; i < row1 ; i++){
        for(int j = 0 ; j < col1 ; j++){
            one[i][j] = scn.nextInt();
        }
    }
// input second matrix
    int row2 = scn.nextInt();
    int col2 = scn.nextInt();
    int[][] two = new int[row2][col2];
    for(int i = 0 ; i < row2 ; i++){
        for(int j = 0 ; j < col2 ; j++){
            two[i][j] = scn.nextInt();
        }
    }

    // check valididty
    if(col1!=row2){
        System.out.println("Invalid input");
        return;
    }

    // multiplying
    int[][] product = new int[row1][col2];

    for(int i = 0 ; i < row1 ; i++){
        for(int j = 0 ;j < col2;j++)
        {
            int val=0;
            for(int k=0;k<row2;k++)
            {
                val+=one[i][k]*two[k][j];
            }
            product[i][j]=val;
        }
    }
    for(int i = 0 ; i < row1 ; i++){
        for(int j = 0 ;j < col2;j++)
        {
            System.out.print(product[i][j]+" ");
        }
        System.out.println();
    }

 }

}
