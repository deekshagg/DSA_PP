import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        // make matrix
        int[][] arr = new int[n][m];
        // input lo matrix ka
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        // spiral function
        int sr = 0 , sc = 0 , dr = n-1 , dc = m-1;

        int te = n*m;
        int count = 0;
        while(count<te){
            
            
            // down
            for(int d = sr ; d <= dr && count<te ; d++){
                System.out.println(arr[d][sc]);
                count++;
            }
            sc++;
            // right
            for(int r = sc ; r <= dc && count<te ; r++){
                System.out.println(arr[dr][r]);
                count++;
            }
            dr--;
            // top
            for(int t = dr ; t >= sr && count<te  ; t--){
                System.out.println(arr[t][dc]);
                count++;
            }
            dc--;
            // left
            for(int l = dc ; l >= sc && count<te  ; l--){
                System.out.println(arr[sr][l]);
                count++;
            }
            sr++;
        }
        // System.out.println(count);
        // System.out.println(te);
    }

}