import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
        for(int i = al.size()-1; i >= 0 ; i--){
            if(isprime(al.get(i))){
                al.remove(i);
            }
        }
		
	}
    public static boolean isprime(int x){
        for(int div = 2; div *div <= x ; div++){
            if(x%div == 0){
                return false;
            }
            
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}