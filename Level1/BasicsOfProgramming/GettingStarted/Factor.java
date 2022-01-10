import java.util.*;
import java.util.Collections;
public class Factor {
  public static void main(String[] args) {
    Scanner scn = new Scanner ( System.in);
    int n= scn.nextInt();
    int ncopy=n;
    ArrayList<Integer> list =  new ArrayList<>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        list.add(i);
        int d= ncopy/i;
        if(i!=d){
          list.add(d);

        }
        
      }
    }
        
    Collections.sort(list);
    
    for(int i = 0 ; i < n ; i++){
        System.out.println(list.toArray()[i]);
    }
  }

}
