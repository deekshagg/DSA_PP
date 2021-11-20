package get_stair_paths;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPaths(int n){

        if(n<0){
            ArrayList<String> basePaths = new ArrayList<>();
            return basePaths;
        }
        else if(n==0){
            ArrayList<String> basePaths = new ArrayList<>();
            basePaths.add("");
            return basePaths;
        }


        ArrayList<String> paths_from_n_minus_1 = getStairPaths(n-1);
        ArrayList<String> paths_from_n_minus_2 = getStairPaths(n-2);
        ArrayList<String> paths_from_n_minus_3 = getStairPaths(n-3);

        ArrayList<String> pathsfrom_n = new ArrayList<>();

        for(String pathsfromnm1 : paths_from_n_minus_1){
           pathsfrom_n.add("1" + pathsfromnm1);
        }

        for(String pathsfromnm2 : paths_from_n_minus_2){
            pathsfrom_n.add("2" + pathsfromnm2);
        }

        for(String pathsfromnm3 : paths_from_n_minus_3){
            pathsfrom_n.add("3" + pathsfromnm3);
        }
        return pathsfrom_n;
    }
}
