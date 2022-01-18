package BDS.BinaryTree.ConstructDisplay;

public class Main {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    public class Pair{
        Node node;
        int state;
    }
    public static Node construct(Integer[] arr){
        return null;
    }
    public static void display(Node node){}
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = construct(arr);
        display(root);
    }
}
