import java.util.*;
public class Diameteroftree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class TreeInfo{
        int diameter;
        int height;
        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo leftInfo = diameter(root.left);
        TreeInfo rightInfo = diameter(root.right);
        int diameterThroughRoot = leftInfo.height + rightInfo.height + 1;
        int maxDiameter = Math.max(diameterThroughRoot, Math.max(leftInfo.diameter, rightInfo.diameter));
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new TreeInfo(maxDiameter, height);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(diameter(root).diameter);
    }
}