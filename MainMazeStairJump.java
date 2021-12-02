import java.util.*;

public class MainMazeStairJump {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    printMazePathJump(1, 1, n, m, "");
  }
  public static void printMazePathJump(int sr, int sc, int dr, int dc, String psf) {
    if (sr == dr && sc == dc) {
      System.out.println(psf);
      return;
    }
    else if (sr > dr || sc > dc) {
      return;
    }
    else{
        for (int i = 1 ; i <= dc - 1 ; i++) {
          printMazePathJump(sr, sc + i, dr, dc, psf + "h" + i);
        }
        for (int i = 1 ; i <= dr - 1 ; i++) {
          printMazePathJump(sr+ i , sc , dr, dc, psf + "v" + i);
        }
        for (int i = 1 ; i <= dr - 1  && i <= dc - 1 ; i++) {
          printMazePathJump(sr + i, sc + i, dr, dc, psf + "d" + i);
        }
    }
  }
}