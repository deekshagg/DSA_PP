import java.util.Scanner;

public class Main4{

    public static int productsAtNegativeTemp(int[] temparature){
        int answer = 0;
        for(int i = 0 ; i < temparature.length ; i++){
            if(temparature[i]<0){
                answer++;
            }
        }
        return answer;
        
    }

// Write your code here


    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        int temperature_size = in.nextInt();
        int temparature[] = new int[temperature_size];
        for(int idx = 0 ; idx<temperature_size ; idx++){
            temparature[idx] = in.nextInt ();   
        }

        int result =  productsAtNegativeTemp(temparature); 
        System.out.print (result);
    }
}