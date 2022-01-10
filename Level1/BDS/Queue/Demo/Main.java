package BDS.Queue.Demo;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(queue); // 10 , 20 , 30 , 40 , 50 , 60 
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.size());

        // queue.add(09);  not able to add
        int n = 012;
        System.out.println(n);

    }
}
