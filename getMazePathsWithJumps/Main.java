package getMazePathsWithJumps;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> result = getMazePaths(1,1,n,m);
        System.out.println(result);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr&&sc==dc){
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        }

        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        for(int ms = 1 ; ms<= dc-sc ; ms++){
            ArrayList<String> horizontalPaths = getMazePaths(sr, sc+ms,dr,dc);
            for(String horizontalString : horizontalPaths){
                paths.add("h" + ms + horizontalString);
            }
        }
        // vertical moves
        for(int ms = 1 ; ms<= dr-sr ; ms++){
            ArrayList<String> verticalPaths = getMazePaths(sr+ms, sc,dr,dc);
            for(String verticalString : verticalPaths){
                paths.add("v" + ms + verticalString);
            }
        }
        // diagonal moves
        for(int ms = 1 ; ms<= dr-sr && ms <= dc-sc ; ms++){
            ArrayList<String> diagonalPaths = getMazePaths(sr+ms, sc+ms,dr,dc);
            for(String diagonalString : diagonalPaths){
                paths.add("d" + ms + diagonalString);
            }
        }
        return paths;
    }

}
