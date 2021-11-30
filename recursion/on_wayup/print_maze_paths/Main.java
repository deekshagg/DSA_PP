package recursion.on_wayup.print_maze_paths;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        printMazePaths(1, 1, row, column, "");

    }
    public static void printMazePaths(int sourceRow, int sourceColumn, int destinationRow, 
    int destinationColumn, String path) {
        if(sourceRow > destinationRow || sourceColumn > destinationColumn){
            return;
        }else if(sourceRow == destinationRow && sourceColumn == destinationColumn){
            System.out.println(path);
            return;
        }
        printMazePaths(sourceRow, sourceColumn + 1, destinationRow, destinationColumn, path + "h");
        printMazePaths(sourceRow + 1, sourceColumn, destinationRow, destinationColumn, path + "v");
    }
}
