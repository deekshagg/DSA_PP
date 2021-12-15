package recursion.withArrayList.get_maze_paths;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        ArrayList<String> paths = get_Maze_Paths(1 ,1 ,row, column);
        System.out.println(paths);
    }

    // soucre row
    // source column
    // destination row 
    // destination column
    public static ArrayList<String> get_Maze_Paths(int sourceRow ,
    int sourceColumn ,int destinationRow ,int destinationColumn ) {
        // positive base path
        if(sourceRow == destinationRow && sourceColumn == destinationColumn){
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath; 
        }
        // negative base path
        else if(sourceRow > destinationRow || sourceColumn > destinationColumn){
            ArrayList<String> basePath = new ArrayList<>();
            // basePath.add("");
            return basePath; 
        }
        ArrayList<String> horizontalPaths = get_Maze_Paths(sourceRow, sourceColumn + 1, 
        destinationRow, destinationColumn);
        ArrayList<String> verticalPaths = get_Maze_Paths(sourceRow + 1, sourceColumn , 
        destinationRow, destinationColumn);
        ArrayList<String> paths = new ArrayList<>();

        for(String h_PathString : horizontalPaths){
            paths.add("h" + h_PathString);
        }

        for(String v_PathString : verticalPaths){
            paths.add("v" + v_PathString);
        }

        return paths;

    }
}
