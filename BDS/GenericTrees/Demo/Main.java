package BDS.GenericTrees.Demo;
import java.util.*;
public class Main {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        Node twenty = new Node(20);
        root.children.add(twenty);

        Node thirty = new Node(30);
        root.children.add(thirty);

        Node forty = new Node(40);
        root.children.add(forty);

        Node fifty = new Node(50);
        root.children.add(twenty);

        Node sixty = new Node(60);
        root.children.add(twenty);

        Node seventy = new Node(70);
        root.children.add(thirty);

        Node eighty = new Node(80);
        root.children.add(thirty);

        Node ninty = new Node(90);
        root.children.add(thirty);

        Node hundred = new Node(100);
        root.children.add(forty);

        Node hundredten = new Node(110);
        root.children.add(eighty);

        Node hundredtwenty = new Node(120);
        root.children.add(eighty);
    }
}
