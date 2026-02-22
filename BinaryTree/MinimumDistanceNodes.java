import java.util.*;
public class MinimumDistanceNodes {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int minDis(Node root, int n1, int n2){
        if(root == null){
            return -1;
        }
        if(root.data == n1 || root.data == n2){
            return 0;
        }
        int leftDis = minDis(root.left, n1, n2);
        int rightDis = minDis(root.right, n1, n2);
        if(leftDis != -1 && rightDis != -1){
            return leftDis + rightDis + 2;
        }
        if(leftDis != -1){
            return leftDis + 1;
        }
        if(rightDis != -1){
            return rightDis + 1;
        }
        return -1;
    }
    public static int findDistance(Node root, int n1, int n2){
        return minDis(root, n1, n2);
    }
    
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        int n1 = 4, n2 = 5;
        System.out.println(findDistance(root, n1, n2));
    }
}