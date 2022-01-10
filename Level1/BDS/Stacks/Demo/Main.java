package BDS.Stacks.Demo;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(70);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());
        // stack.pop();
    }
}