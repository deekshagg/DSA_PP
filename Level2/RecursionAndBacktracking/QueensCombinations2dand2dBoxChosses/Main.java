package Level2.RecursionAndBacktracking.QueensCombinations2dand2dBoxChosses;

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        if(col == tq) {
            col = 0;
            row++;
            asf += "\n";
        }
        if(row == tq) {
            if(qpsf == tq){
                System.out.println(asf);
            }
            return;
        }
        queensCombinations(qpsf + 1, tq, row, col + 1, asf + "q"); 
        queensCombinations(qpsf, tq, row, col + 1, asf + "-"); 
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        queensCombinations(0, n, 0, 0, "");
    }
}