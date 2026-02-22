import java.util.*;
public class roottoleafpath {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void rootToLeaf(Node root, List<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        List<Integer> path = new ArrayList<>();
        rootToLeaf(root, path);
    }
}