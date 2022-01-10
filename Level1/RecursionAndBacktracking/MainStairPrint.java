
import java.util.*;

 public class MainStairPrint {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printStairCase(n,"");

  }
  public static void printStairCase(int n , String path){
    if(n==0){
      System.out.println(path);
      return;
    }
    if(n<0){
        return;
    }
    printStairCase(n-1,path+"1");
    printStairCase(n-2,path+"2");
    printStairCase(n-3,path+"3");
  }
}
