import java.util.*;

public class MainMazePath {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    printMazePath(1,1,n,m, "");

  }
  public static void printMazePath(int sr , int sc , int dr , int dc, String path){
    if(sr == dr && sc == dc){
      System.out.println(path);
      return;
    }else if(sr>dr || sc>dc){
      return;
    }
    printMazePath(sr,sc+1,dr,dc, path + "h");
    printMazePath(sr+1,sc,dr,dc, path + "v");
  }
}